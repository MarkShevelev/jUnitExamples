package org.itstep;

import java.util.List;

public class SimpleContext {
    private final List<Integer> list;

    public SimpleContext(List<Integer> list) {
        this.list = list;
    }

    public int max() {
        return list.stream().mapToInt(x->x).max().orElseThrow(IllegalArgumentException::new);
    }

    public int sum() {
        return list.stream().mapToInt(x->x).sum();
    }
}
