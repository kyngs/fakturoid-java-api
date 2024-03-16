package xyz.kyngs.fakturoid.api.v3.impl.okhttp4.client.invoices;

import xyz.kyngs.fakturoid.api.v3.client.invoices.InvoicesClient;
import xyz.kyngs.fakturoid.api.v3.impl.okhttp4.OKHTTP4FakturoidClient;
import xyz.kyngs.fakturoid.api.v3.impl.okhttp4.client.OKHTTP4AbstractClient;
import xyz.kyngs.fakturoid.api.v3.model.invoice.Invoice;

import java.io.File;
import java.io.IOException;

public class OKHTTP4InvoicesClient extends OKHTTP4AbstractClient implements InvoicesClient {
    public OKHTTP4InvoicesClient(OKHTTP4FakturoidClient fakturoidClient, String account) {
        super(fakturoidClient, account);
    }

    @Override
    public Invoice getInvoice(int id) {
        return execute(createRequest("/accounts/" + account + "/invoices/" + id + ".json").get(), Invoice.class);
    }

    @Override
    public DownloadInvoiceResult downloadInvoice(File destination, int id) {
        if (destination.exists()) {
            throw new IllegalArgumentException("Destination file already exists");
        }

        try (var res = execute(createRequest("/accounts/" + account + "/invoices/" + id + "/download.pdf").get())) {
            switch (res.code()) {
                case 200 -> {
                    try (var body = res.body()) {
                        if (!destination.createNewFile()) {
                            throw new IOException("Could not create destination file");
                        }

                        var sink = okio.Okio.buffer(okio.Okio.sink(destination));
                        assert body != null;
                        sink.writeAll(body.source());
                        sink.close();
                        return DownloadInvoiceResult.SUCCESS;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                case 404 -> {
                    return DownloadInvoiceResult.NOT_FOUND;
                }
                case 204 -> {
                    return DownloadInvoiceResult.GENERATING;
                }
            }
        }
        throw new RuntimeException("Failed to download invoice"); // Should never happen
    }
}
