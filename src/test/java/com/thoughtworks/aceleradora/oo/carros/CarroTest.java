package com.thoughtworks.aceleradora.oo.carros;

import com.thoughtworks.gauge.ContinueOnFailure;
import com.thoughtworks.gauge.Step;

import static com.thoughtworks.aceleradora.checkers.FieldQuery.query;

public class CarroTest {

    @Step("Adicione à classe carro o atributo <atributo> do tipo <tipo>")
    @ContinueOnFailure
    public void carroPossuiAtributoEsperado(String atributo, String tipo) {
        query(Carro.class)
                .field(atributo)
                .withType(tipo)
                .check();

    }

}