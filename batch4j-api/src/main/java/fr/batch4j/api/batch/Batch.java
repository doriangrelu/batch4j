package fr.batch4j.api.batch;

import java.util.List;

public interface Batch {

    String identifier();
    String displayName();
    List<Job> jobs();

}
