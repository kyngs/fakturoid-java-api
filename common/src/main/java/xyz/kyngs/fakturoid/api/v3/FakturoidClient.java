package xyz.kyngs.fakturoid.api.v3;


import xyz.kyngs.fakturoid.api.v3.client.subjects.SubjectsClient;
import xyz.kyngs.fakturoid.api.v3.client.invoices.InvoicesClient;

public interface FakturoidClient {
    /**
     * Refreshes the access token
     */
    void refreshToken();

    /**
     * Verifies whether the access token is still valid, if not, refreshes it
     */
    void verifyToken();

    /**
     * @return Invoices client for the given account
     */
    InvoicesClient invoices(String account);

    /**
     * @return Subjects client for the given account
     */
    SubjectsClient subjects(String account);
}
