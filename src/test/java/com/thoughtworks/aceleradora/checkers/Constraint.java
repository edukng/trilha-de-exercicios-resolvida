package com.thoughtworks.aceleradora.checkers;

public interface Constraint<T> {
    void check(Class<T> target);
}

