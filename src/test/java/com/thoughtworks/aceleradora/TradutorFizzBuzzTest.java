package com.thoughtworks.aceleradora;

import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class TradutorFizzBuzzTest {

    private TradutorFizzBuzz tradutor;

    @BeforeStep
    public void config() {
        tradutor = new TradutorFizzBuzz();
    }

    @Step("Traduz <numero> para <traducao>")
    public void traduzNumerosFizzCorretamente(int numero, String traducao) {

        assertThat(tradutor.traduz(numero)).isEqualTo(traducao);
    }
}
