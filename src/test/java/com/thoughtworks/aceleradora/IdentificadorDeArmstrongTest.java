package com.thoughtworks.aceleradora;


import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.ContinueOnFailure;
import com.thoughtworks.gauge.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class IdentificadorDeArmstrongTest {

    private IdentificadorDeArmstrong identificador;

    @BeforeStep
    public void config() {
        identificador = new IdentificadorDeArmstrong();
    }

    @Step("Identifica <numero> corretamente, responendo <mensagem>")
    @ContinueOnFailure
    public void traduzNumerosFizzCorretamente(int numero, String mensagem) {

        assertThat(identificador.identificaNumero(numero))
                .as("Ao receber %d o identificador responde \"%s\", quando deveria responder \"%s\"",
                        numero,
                        identificador.identificaNumero(numero),
                        mensagem
                )
                .isEqualTo(mensagem);
    }

}