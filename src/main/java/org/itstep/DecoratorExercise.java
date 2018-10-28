package org.itstep;

import java.util.function.Supplier;

/**
 * String supplier decorator
 * Taking existing supplier and returns uppercase string
 *
 * */
public class DecoratorExercise implements Supplier<String> {
    private final Supplier<String> origin;

    public DecoratorExercise(Supplier<String> origin) {
        this.origin = origin;
    }

    @Override
    public String get() {
        return origin.get().toUpperCase();
    }
}
