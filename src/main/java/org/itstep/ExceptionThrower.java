package org.itstep;

public class ExceptionThrower {
    private final String message;

    public ExceptionThrower(String message) {
        this.message = message;
    }

    public boolean doThrow(boolean b) {
        if (b)
            throw new RuntimeException(message);
        return false;
    }
}
