package com.thoughtworks.aceleradora.checkers;

import com.thoughtworks.aceleradora.ImplementacaoIncorreta;

import java.lang.reflect.Field;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class FieldQuery<T> {

    private ClassDigger<T> digger;

    private String name;
    private String type;

    private FieldQuery(ClassDigger<T> digger, String name) {
        this.digger = digger;
        this.name = name;
    }

    private FieldQuery(ClassDigger<T> digger, String name, String type) {
        this.digger = digger;
        this.name = name;
        this.type = type;
    }

    private FieldQuery(ClassDigger<T> classDigger) {
       this.digger = classDigger;
    }

    public static <R> FieldQuery query(Class<R> target) {
        return new FieldQuery<>(new ClassDigger<>(target));
    }

    public FieldQuery<T> field(String fieldName) {
        return new FieldQuery<>(digger, fieldName);
    }

    public FieldQuery<T> withType(String type) {
        return new FieldQuery<>(digger, name, type);
    }

    public void check() {
        Field fieldFound = digger.fields()
                .stream()
                .filter(field -> field.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> attributeNotFound(name));

        if (!fieldFound.getType().getSimpleName().equals(type)) {
            throw incorrectType(name, type, fieldFound.getType().getSimpleName());
        }
    }

    private long fieldCount() {
        return digger.fields().size();
    }

    private Stream<String> fieldNames() {
        return digger.fields().stream().map(Field::getName);
    }

    private ImplementacaoIncorreta attributeNotFound(String nome) {
        String atributosDeclarados = fieldCount() == 0
                ? "Nenhum atributo foi declarado nesta classe ainda."
                : String.format("Os atributos declarados nesta classe sao os seguintes: %s", fieldNames()
                .collect(joining(", ")));

        String mensagemDeErro = String.format("A classe carro deve possuir o atributo \"%s\". %s",
                nome, atributosDeclarados);

        throw new ImplementacaoIncorreta(mensagemDeErro);
    }

    private ImplementacaoIncorreta incorrectType(String atributo, String tipoEsperado, String tipoEncontrado) {
        String mensagem = String.format("O atributo %s deve ser do tipo %s, mas foi declarado como %s", atributo, tipoEsperado, tipoEncontrado);

        return new ImplementacaoIncorreta(mensagem);
    }
}
