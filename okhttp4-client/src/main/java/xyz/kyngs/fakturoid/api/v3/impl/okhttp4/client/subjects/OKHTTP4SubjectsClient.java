package xyz.kyngs.fakturoid.api.v3.impl.okhttp4.client.subjects;

import xyz.kyngs.fakturoid.api.v3.client.subjects.SubjectsClient;
import xyz.kyngs.fakturoid.api.v3.impl.okhttp4.OKHTTP4FakturoidClient;
import xyz.kyngs.fakturoid.api.v3.impl.okhttp4.client.OKHTTP4AbstractClient;

public class OKHTTP4SubjectsClient extends OKHTTP4AbstractClient implements SubjectsClient {

    public OKHTTP4SubjectsClient(OKHTTP4FakturoidClient fakturoidClient, String account) {
        super(fakturoidClient, account);
    }
}
