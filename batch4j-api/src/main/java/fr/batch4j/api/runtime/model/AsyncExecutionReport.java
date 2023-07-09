package fr.batch4j.api.runtime.model;

import java.util.concurrent.CompletableFuture;

public record AsyncExecutionReport<T>(String identifier, CompletableFuture<ExecutionReport<T>> report) {

}
