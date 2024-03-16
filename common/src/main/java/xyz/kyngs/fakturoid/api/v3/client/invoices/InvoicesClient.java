package xyz.kyngs.fakturoid.api.v3.client.invoices;

import xyz.kyngs.fakturoid.api.v3.model.invoice.Invoice;

public interface InvoicesClient {
    /**
     * Returns the invoice with the given id
     * @param id id of the invoice
     * @return the invoice with the given id, or null if it does not exist
     */
    Invoice getInvoice(int id);
}
