package xyz.kyngs.fakturoid.api.v3.client.invoices;

import xyz.kyngs.fakturoid.api.v3.model.invoice.Invoice;

import java.io.File;
import java.util.HashMap;

public interface InvoicesClient {
    /**
     * Returns the invoice with the given id
     *
     * @param id id of the invoice
     * @return the invoice with the given id, or null if it does not exist
     */
    Invoice getInvoice(int id);

    /**
     * Creates a new invoice
     *
     * @param invoice the invoice to create
     * @return the created invoice
     */
    Invoice createInvoice(Invoice invoice);

    /**
     * Updates the invoice with the given id
     *
     * @param id   id of the invoice
     * @param data the data to update the invoice with
     * @return the updated invoice
     */
    Invoice updateInvoice(int id, HashMap<String, ?> data);

    /**
     * Updates the given invoice
     *
     * @param invoice the invoice to update
     * @param data    the data to update the invoice with
     * @return the updated invoice
     */
    default Invoice updateInvoice(Invoice invoice, HashMap<String, ?> data) {
        return updateInvoice(invoice.getId(), data);
    }

    /**
     * Downloads the PDF of the invoice with the given id to the given file
     *
     * @param id id of the invoice
     * @return DownloadInvoiceResult, or null if the invoice does not exist
     */
    DownloadInvoiceResult downloadInvoice(int id);

    /**
     * Downloads the PDF of the given invoice to the given file
     *
     * @param invoice the invoice to download
     * @return DownloadInvoiceResult, or null if the invoice does not exist
     */
    default DownloadInvoiceResult downloadInvoice(Invoice invoice) {
        return downloadInvoice(invoice.getId());
    }

    /**
     * Returns the payments client for the invoice with the given id
     *
     * @param id id of the invoice
     * @return the payments client for the invoice with the given id
     */
    InvoicePaymentsClient payments(long id);

    /**
     * Represents the result of a download invoice request
     *
     * @param data the data of the invoice, or null if the invoice is being generated
     */
    record DownloadInvoiceResult(byte[] data) {

    }
}
