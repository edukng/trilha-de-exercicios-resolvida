package com.thoughtworks.aceleradora.oo.carros;

import com.thoughtworks.gauge.ContinueOnFailure;
import com.thoughtworks.gauge.Step;

import static com.thoughtworks.aceleradora.checkers.MethodConstraint.Builder.getterFor;
import static com.thoughtworks.aceleradora.checkers.MethodConstraint.Builder.setterFor;
import static com.thoughtworks.aceleradora.checkers.QueryBuilder.query;

public class CarroTest {

    @Step("Adicione à classe carro o atributo <atributo> do tipo <tipo>")
    @ContinueOnFailure
    public void carroPossuiAtributoEsperado(String atributo, String tipo) {
        query(Carro.class)
                .field(field -> field
                        .name(atributo)
                        .type(tipo)
                )
                .check();
    }

    @Step("Adicione à classe carro um método getter para o atributo <atributo>")
    @ContinueOnFailure
    public void carroPossuiGetter(String atributo) {
        query(Carro.class)
                .method(getterFor(atributo))
                .check();
    }

    @Step("Adicione à classe carro um método setter para o atributo <atributo>")
    @ContinueOnFailure
    public void carroPossuiSetter(String atributo) {
        query(Carro.class)
                .method(setterFor(atributo))
                .check();
    }

}