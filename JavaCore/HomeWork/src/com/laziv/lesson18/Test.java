package com.laziv.lesson18;

import java.util.Objects;

public class Test {
    int a;
    int b;

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return a == test.a &&
                b == test.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
