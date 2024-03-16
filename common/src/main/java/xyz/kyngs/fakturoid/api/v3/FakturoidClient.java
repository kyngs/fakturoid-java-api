package xyz.kyngs.fakturoid.api.v3;


import xyz.kyngs.fakturoid.api.v3.client.subjects.SubjectsClient;
import xyz.kyngs.fakturoid.api.v3.client.invoices.InvoicesClient;

/**
 * A client for the Fakturoid API
 * An implementation of this interface should run the {@link #verifyToken()} method on construction and before every request
 */
public interface FakturoidClient {
    /**
     * Refreshes the access token
     * It recommended to call this method every two hours (or a bit earlier = each 7140 seconds) to prevent the token from expiring
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
