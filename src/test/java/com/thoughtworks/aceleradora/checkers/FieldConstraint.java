package com.thoughtworks.aceleradora.checkers;

import com.thoughtworks.aceleradora.ImplementacaoIncorreta;

import java.lang.reflect.Field;
import java.util.function.Consumer;

import static java.lang.String.format;

public class FieldConstraint<T> implements Constraint<T> {

    public static class Builder<T> {

        private String name;
        private String type;

        public Builder(Consumer<Builder<T>> definitions) {
            definitions.accept(this);
        }

        public FieldConstraint.Builder<T> name(String name) {
            this.name = name;
            return this;
        }

        public FieldConstraint.Builder<T> type(String type) {
            this.type = type;
            return this;
        }

        public FieldConstraint<T> build() {
            return new FieldConstraint<>(name, type);
        }
    }

    private String name;
    private String type;

    public FieldConstraint(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void check(Class<T> target) {
        try {
            Field field = target.getDeclaredField(name);

            if (!field.getType().getSimpleName().equals(type)) {
                throw new ImplementacaoIncorreta(
                        format("O atributo %s foi declarado com tipo %s, mas deveria ser do tipo %s",
                                name, field.getType().getSimpleName(), type));
            }

        } catch (NoSuchFieldException e) {
            throw new ImplementacaoIncorreta(
                    format("O atributo \"%s\" nao foi encontrado na classe \"%s\"", name, target.getSimpleName()));
        }
    }
}
