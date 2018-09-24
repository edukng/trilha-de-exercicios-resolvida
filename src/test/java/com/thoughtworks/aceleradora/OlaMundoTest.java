package com.thoughtworks.aceleradora;

import com.thoughtworks.gauge.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class OlaMundoTest {

    @Step("Responde com olá, mundo")
    public void respondeComOlaMundo() {
        assertThat("")
                .as("O programa deveria retornar \"Olá, mundo\", mas está retornando \"\"")
                .isEqualTo("Olá, mundo");
    }

}
