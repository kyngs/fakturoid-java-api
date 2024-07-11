package xyz.kyngs.fakturoid.api.v3.client.invoices;

import xyz.kyngs.fakturoid.api.v3.model.invoice.Invoice;

import java.io.File;
import java.util.HashMap;

public interface InvoicesClient {
    /**
     * Returns the invoice with the given id
     * @param id id of the invoice
     * @return the invoice with the given id, or null if it does not exist
     */
    Invoice getInvoice(int id);

    /**
     * Creates a new invoice
     * @param invoice the invoice to create
     * @return the created invoice
     */
    Invoice createInvoice(Invoice invoice);

    /**
     * Updates the invoice with the given id
     * @param id id of the invoice
     * @param data the data to update the invoice with
     * @return the updated invoice
     */
    Invoice updateInvoice(int id, HashMap<String, ?> data);

    /**
     * Updates the given invoice
     * @param invoice the invoice to update
     * @param data the data to update the invoice with
     * @return the updated invoice
     */
    default Invoice updateInvoice(Invoice invoice, HashMap<String, ?> data) {
        return updateInvoice(invoice.getId(), data);
    }

    /**
     * Downloads the PDF of the invoice with the given id to the given file
     * @param destination the file to download the invoice to
     * @param id id of the invoice
     * @return SUCCESS if the download was successful, GENERATING if the invoice is still being generated, NOT_FOUND if the invoice does not exist
     */
    DownloadInvoiceResult downloadInvoice(File destination, int id);

    /**
     * Downloads the PDF of the given invoice to the given file
     * @param destination the file to download the invoice to
     * @param invoice the invoice to download
     * @return SUCCESS if the download was successful, GENERATING if the invoice is still being generated, NOT_FOUND if the invoice does not exist
     */
    default DownloadInvoiceResult downloadInvoice(File destination, Invoice invoice) {
        return downloadInvoice(destination, invoice.getId());
    }

    /**
     * Returns the payments client for the invoice with the given id
     * @param id id of the invoice
     * @return the payments client for the invoice with the given id
     */
    InvoicePaymentsClient payments(long id);

    /**
     * Result of the downloadInvoice method
     */
    enum DownloadInvoiceResult {
        /**
         * The download was successful
         */
        SUCCESS,
        /**
         * The invoice is still being generated
         */
        GENERATING,
        /**
         * The invoice does not exist
         */
        NOT_FOUND
    }
}
