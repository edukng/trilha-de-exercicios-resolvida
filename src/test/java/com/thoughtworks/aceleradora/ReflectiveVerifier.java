package com.thoughtworks.aceleradora;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ReflectiveVerifier<T> {

    private Class<T> target;

    private List<Field> fields;

    public ReflectiveVerifier(Class<T> target) {
        this.target = target;
        fields = Stream.of(target.getDeclaredFields()).collect(toList());
    }

    public long fieldCount() {
        return fields.size();
    }

    public Stream<String> fieldNames() {
       return fields.stream().map(Field::getName);
    }

    public Stream<Field> fields() {
        return Stream.of(target.getDeclaredFields());
    }

    public Optional<Field> findField(String fieldName) {
        return fields()
                .filter(field -> field.getName().equals(fieldName))
                .findFirst();
    }
}
