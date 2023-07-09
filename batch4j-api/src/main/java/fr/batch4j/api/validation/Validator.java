package fr.batch4j.api.validation;

import fr.batch4j.api.context.ExecutionContext;

@FunctionalInterface
public interface Validator<T> {

    Validation validate(T value, ExecutionContext context);

}
