package com.thoughtworks.aceleradora.oo.conversor;

import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.ContinueOnFailure;
import com.thoughtworks.gauge.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class ConversorTest {

    private Conversor conversor;

    @BeforeStep
    public void config() {
        conversor = new Conversor();
    }

    @Step("Deve converter <entrada> para <saida>")
    @ContinueOnFailure
    public void converteMoedasCorretamente(String entrada, String saida) {

        assertThat(conversor.converter(entrada))
                .as("Ao receber %s o conversor retorna \"%s\", quando deveria estar retornando \"%s\"",
                        entrada,
                        conversor.converter(entrada),
                        saida
                )
                .isEqualTo(saida);
    }

    @Step("Ao receber <entrada> deve retornar mensagem <mensagem>")
    @ContinueOnFailure
    public void mostraMensagensDeErro(String entrada, String saida) {

        assertThat(conversor.converter(entrada))
                .as("Ao receber %s o tradutor retorna \"%s\", quando deveria estar retornando \"%s\"",
                        entrada,
                        conversor.converter(entrada),
                        saida
                )
                .isEqualTo(saida);
    }

}