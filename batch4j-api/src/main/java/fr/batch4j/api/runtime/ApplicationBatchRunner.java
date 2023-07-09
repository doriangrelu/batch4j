package fr.batch4j.api.runtime;

import fr.batch4j.api.runtime.model.ExecutionReport;

import java.util.List;

public interface ApplicationBatchRunner {

    <T> ExecutionReport<T> start(List<String> programArguments);

}
