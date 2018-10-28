package org.itstep;

import java.io.IOException;
import java.io.Writer;
import java.util.function.Consumer;

public class StringConsumer implements Consumer<String> {
    private final Writer w;

    public StringConsumer(Writer w) {
        this.w = w;
    }

    @Override
    public void accept(String s) {
        try {
            w.write(s);
        } catch(IOException e) {
            throw new RuntimeException("File reading error",e);
        }
    }
}
