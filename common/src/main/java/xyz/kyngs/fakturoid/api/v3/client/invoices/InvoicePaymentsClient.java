package xyz.kyngs.fakturoid.api.v3.client.invoices;

import xyz.kyngs.fakturoid.api.v3.model.invoice.Invoice;

public interface InvoicePaymentsClient {
    /**
     * Creates a new payment
     * @param payment the payment to create
     * @return the created payment
     */
    Invoice.Payment createPayment(Invoice.Payment payment);
}
