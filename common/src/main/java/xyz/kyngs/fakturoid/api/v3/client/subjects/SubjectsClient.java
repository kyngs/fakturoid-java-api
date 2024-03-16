package xyz.kyngs.fakturoid.api.v3.client.subjects;

import xyz.kyngs.fakturoid.api.v3.model.subject.Subject;

import java.util.HashMap;

public interface SubjectsClient {
    /**
     * Returns the subject with the given id
     * @param id id of the subject
     * @return the subject with the given id, or null if it does not exist
     */
    Subject getSubject(int id);

    /**
     * Creates a new subject
     * @param subject the subject to create
     * @return the created subject
     */
    Subject createSubject(Subject subject);

    /**
     * Updates the subject with the given id
     * @param id id of the subject
     * @param data the data to update the subject with
     * @return the updated subject
     */
    Subject updateSubject(int id, HashMap<String, ?> data);

    /**
     * Updates the given subject
     * @param subject the subject to update
     * @param data the data to update the subject with
     * @return the updated subject
     */
    default Subject updateSubject(Subject subject, HashMap<String, ?> data) {
        return updateSubject(subject.getId(), data);
    }

}
