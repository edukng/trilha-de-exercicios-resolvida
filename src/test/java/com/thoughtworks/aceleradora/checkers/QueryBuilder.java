package com.thoughtworks.aceleradora.checkers;

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

    public QueryBuilder<T> field(Consumer<FieldConstraint.Builder<T>> definitions) {
        constraints.add(new FieldConstraint.Builder<>(definitions).build());
        return this;
    }

    public QueryBuilder<T> method(Consumer<MethodConstraint.Builder<T>> definitions) {
        constraints.add(new MethodConstraint.Builder<>(definitions).build());
        return this;
    }

    public static <T> QueryBuilder<T> query(Class<T> target) {
        return new QueryBuilder<>(target);
    }

    public void check() {
        constraints.forEach(constraint -> constraint.check(target));
    }
}
