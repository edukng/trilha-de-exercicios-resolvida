package com.aceleradora.checkers;

import com.aceleradora.ImplementacaoIncorreta;

import java.lang.reflect.Field;

public class AttributeExtractor {

    public static <T, R> T getAttributeValue(R target, String name) {
        try {
            Field field = target.getClass().getDeclaredField(name);
            field.setAccessible(true);

            return (T) field.get(target);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new ImplementacaoIncorreta(String.format("Campo %s nao declarado na classe %s", name, target.getClass()));
        }
    }
}
