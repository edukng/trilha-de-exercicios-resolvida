package com.thoughtworks.aceleradora;

import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.ContinueOnFailure;
import com.thoughtworks.gauge.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class TradutorFizzBuzzTest {

    private TradutorFizzBuzz tradutor;

    @BeforeStep
    public void config() {
        tradutor = new TradutorFizzBuzz();
    }

    @Step("Ao receber <numero> deve retornar <traducao>")
    @ContinueOnFailure
    public void traduzNumerosFizzCorretamente(int numero, String traducao) {

        assertThat(tradutor.traduz(numero))
                .as("Ao receber %d o tradutor retorna \"%s\", quando deveria estar retornando \"%s\"",
                        numero,
                        tradutor.traduz(numero),
                        traducao
                )
                .isEqualTo(traducao);
    }
}
