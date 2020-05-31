package com.aceleradora.checkers;

public interface Constraint<T> {
    void check(Class<T> target);
}

