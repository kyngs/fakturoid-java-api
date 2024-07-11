package xyz.kyngs.fakturoid.api.v3.impl.okhttp4.client.invoices;

import xyz.kyngs.fakturoid.api.v3.client.invoices.InvoicePaymentsClient;
import xyz.kyngs.fakturoid.api.v3.impl.okhttp4.OKHTTP4FakturoidClient;
import xyz.kyngs.fakturoid.api.v3.impl.okhttp4.client.OKHTTP4AbstractClient;
import xyz.kyngs.fakturoid.api.v3.model.invoice.Invoice;

public class OKHTTP4InvoicePaymentsClient extends OKHTTP4AbstractClient implements InvoicePaymentsClient {

    private final long invoiceId;

    public OKHTTP4InvoicePaymentsClient(OKHTTP4FakturoidClient fakturoidClient, String account, long invoiceId) {
        super(fakturoidClient, account);
        this.invoiceId = invoiceId;
    }

    @Override
    public Invoice.Payment createPayment(Invoice.Payment payment) {
        return execute(createRequest("/accounts/" + account + "/invoices/" + invoiceId + "/payments.json").post(jsonBody(payment)), Invoice.Payment.class, 403);
    }
}
