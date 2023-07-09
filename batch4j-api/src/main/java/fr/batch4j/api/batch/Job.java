package fr.batch4j.api.batch;

import java.util.List;

public interface Job {

    String identifier();
    String displayName();
    List<Argument> arguments();
    List<Task> tasks();

}
