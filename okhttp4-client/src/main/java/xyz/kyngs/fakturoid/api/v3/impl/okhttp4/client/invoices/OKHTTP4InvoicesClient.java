package xyz.kyngs.fakturoid.api.v3.impl.okhttp4.client.invoices;

import xyz.kyngs.fakturoid.api.v3.client.invoices.InvoicePaymentsClient;
import xyz.kyngs.fakturoid.api.v3.client.invoices.InvoicesClient;
import xyz.kyngs.fakturoid.api.v3.impl.okhttp4.OKHTTP4FakturoidClient;
import xyz.kyngs.fakturoid.api.v3.impl.okhttp4.client.OKHTTP4AbstractClient;
import xyz.kyngs.fakturoid.api.v3.model.invoice.Invoice;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class OKHTTP4InvoicesClient extends OKHTTP4AbstractClient implements InvoicesClient {
    public OKHTTP4InvoicesClient(OKHTTP4FakturoidClient fakturoidClient, String account) {
        super(fakturoidClient, account);
    }

    @Override
    public Invoice getInvoice(int id) {
        return execute(createRequest("/accounts/" + account + "/invoices/" + id + ".json").get(), Invoice.class);
    }

    @Override
    public Invoice createInvoice(Invoice invoice) {
        return execute(createRequest("/accounts/" + account + "/invoices.json").post(jsonBody(invoice)), Invoice.class, 403);
    }

    @Override
    public Invoice updateInvoice(int id, HashMap<String, ?> data) {
        return execute(createRequest("/accounts/" + account + "/invoices/" + id + ".json").patch(jsonBody(data)), Invoice.class, 403);
    }

    @Override
    public DownloadInvoiceResult downloadInvoice(int id) {
        try (var res = execute(createRequest("/accounts/" + account + "/invoices/" + id + "/download.pdf").get())) {
            switch (res.code()) {
                case 200 -> {
                    try (var body = res.body()) {
                        assert body != null;

                        return new DownloadInvoiceResult(body.bytes());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                case 404 -> {
                    return null;
                }
                case 204 -> {
                    return new DownloadInvoiceResult(null);
                }
            }
        }
        throw new RuntimeException("Failed to download invoice"); // Should never happen
    }

    @Override
    public InvoicePaymentsClient payments(long id) {
        return new OKHTTP4InvoicePaymentsClient(fakturoidClient, account, id);
    }
}
