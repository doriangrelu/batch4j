package fr.batch4j.api.runtime;

import fr.batch4j.api.runtime.model.AsyncExecutionReport;

import java.util.List;

public interface AsyncApplicationBatchRunner {

    <T> AsyncExecutionReport<T> start(List<String> programArguments);
    boolean stop(String identifier);

}
