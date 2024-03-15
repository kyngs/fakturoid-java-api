package xyz.kyngs.fakturoid.api.v3;


import xyz.kyngs.fakturoid.api.v3.client.subjects.SubjectsClient;
import xyz.kyngs.fakturoid.api.v3.client.invoices.InvoicesClient;

public interface FakturoidClient {
    void refreshToken();

    void verifyToken();

    InvoicesClient invoices(String account);

    SubjectsClient subjects(String account);
}
