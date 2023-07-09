package fr.batch4j.api.batch;

import fr.batch4j.api.validation.Validator;

import java.util.List;

public interface Argument<T> {

    String name();

    default boolean required() {
        return true;
    }

    default T defaultValue() {
        return null;
    }

    List<Validator<T>> validators();

}
