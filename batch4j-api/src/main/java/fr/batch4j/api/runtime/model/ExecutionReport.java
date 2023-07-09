package fr.batch4j.api.runtime.model;

public record ExecutionReport<T>(Status status, T content) {
}
