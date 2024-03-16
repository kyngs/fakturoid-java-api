package xyz.kyngs.fakturoid.api.v3.impl.okhttp4.client.subjects;

import xyz.kyngs.fakturoid.api.v3.client.subjects.SubjectsClient;
import xyz.kyngs.fakturoid.api.v3.impl.okhttp4.OKHTTP4FakturoidClient;
import xyz.kyngs.fakturoid.api.v3.impl.okhttp4.client.OKHTTP4AbstractClient;
import xyz.kyngs.fakturoid.api.v3.model.subject.Subject;

import java.util.HashMap;

public class OKHTTP4SubjectsClient extends OKHTTP4AbstractClient implements SubjectsClient {

    public OKHTTP4SubjectsClient(OKHTTP4FakturoidClient fakturoidClient, String account) {
        super(fakturoidClient, account);
    }

    @Override
    public Subject getSubject(int id) {
        return execute(createRequest("/accounts/" + account + "/subjects/" + id + ".json").get(), Subject.class);
    }

    @Override
    public Subject createSubject(Subject subject) {
        return execute(createRequest("/accounts/" + account + "/subjects.json").post(jsonBody(subject)), Subject.class, 403);
    }

    @Override
    public Subject updateSubject(int id, HashMap<String, ?> data) {
        return execute(createRequest("/accounts/" + account + "/subjects/" + id + ".json").patch(jsonBody(data)), Subject.class, 403);
    }
}
