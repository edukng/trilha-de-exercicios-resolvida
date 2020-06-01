package com.aceleradora.checkers;

import com.aceleradora.ImplementacaoIncorreta;

import java.util.function.Consumer;
import java.util.stream.Stream;

import static java.lang.String.format;

public class MethodConstraint<T> implements Constraint<T> {

    public static final class Builder<T> {

        private String name;

        public Builder(Consumer<Builder<T>> definitions) {
            definitions.accept(this);
        }

        private static String accessorName(String prefix, String attribute) {
            return prefix + attribute.substring(0, 1).toUpperCase() + attribute.substring(1);
        }

        public static <T> Consumer<Builder<T>> getterFor(String attributeName) {
            return builder -> builder
                    .name(accessorName("get", attributeName));
        }

        public static <T> Consumer<Builder<T>> setterFor(String attributeName) {
            return builder -> builder
                    .name(accessorName("set", attributeName));
        }

        public Builder<T> name(String name) {
            this.name = name;
            return this;
        }

        public com.aceleradora.checkers.MethodConstraint<T> build() {
            return new com.aceleradora.checkers.MethodConstraint<>(name);
        }
    }

    private String name;

    public MethodConstraint(String name) {
        this.name = name;
    }

    @Override
    public void check(Class<T> target) {
        Stream
                .of(target.getDeclaredMethods())
                .filter(method -> method.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new ImplementacaoIncorreta(format("A classe %s nao possui nenhum metodo chamado %s",
                        target.getSimpleName(), name)));
    }
}
