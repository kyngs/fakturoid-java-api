package xyz.kyngs.fakturoid.api.v3.impl.okhttp4.client.invoices;

import xyz.kyngs.fakturoid.api.v3.client.invoices.InvoicesClient;
import xyz.kyngs.fakturoid.api.v3.impl.okhttp4.OKHTTP4FakturoidClient;
import xyz.kyngs.fakturoid.api.v3.impl.okhttp4.client.OKHTTP4AbstractClient;
import xyz.kyngs.fakturoid.api.v3.model.auth.OAuthToken;
import xyz.kyngs.fakturoid.api.v3.model.invoice.Invoice;

import java.util.Map;

public class OKHTTP4InvoicesClient extends OKHTTP4AbstractClient implements InvoicesClient {
    public OKHTTP4InvoicesClient(OKHTTP4FakturoidClient fakturoidClient, String account) {
        super(fakturoidClient, account);
    }

    @Override
    public Invoice getInvoice(int id) {
        return execute(createRequest("/accounts/" + account + "/invoices/" + id + ".json").get(), Invoice.class);
    }
}
