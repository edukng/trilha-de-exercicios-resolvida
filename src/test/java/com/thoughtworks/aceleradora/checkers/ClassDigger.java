package com.thoughtworks.aceleradora.checkers;

import java.lang.reflect.Field;
import java.util.List;

import static java.util.Arrays.asList;

public class ClassDigger<T> {

    private Class<T> target;

    public ClassDigger(Class<T> target) {
        this.target = target;
    }

    public List<Field> fields() {
       return asList(target.getDeclaredFields());
    }
}
