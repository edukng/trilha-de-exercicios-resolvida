package com.aceleradora.checkers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class QueryBuilder<T> {
    private Class<T> target;

    private List<Constraint<T>> constraints;

    public QueryBuilder(Class<T> target) {
        this.constraints = new ArrayList<>();
        this.target = target;
    }

    public com.aceleradora.checkers.QueryBuilder<T> field(Consumer<com.aceleradora.checkers.FieldConstraint.Builder<T>> definitions) {
        constraints.add(new FieldConstraint.Builder<>(definitions).build());
        return this;
    }

    public com.aceleradora.checkers.QueryBuilder<T> method(Consumer<com.aceleradora.checkers.MethodConstraint.Builder<T>> definitions) {
        constraints.add(new MethodConstraint.Builder<>(definitions).build());
        return this;
    }

    public static <T> com.aceleradora.checkers.QueryBuilder<T> query(Class<T> target) {
        return new com.aceleradora.checkers.QueryBuilder<>(target);
    }

    public void check() {
        constraints.forEach(constraint -> constraint.check(target));
    }
}
