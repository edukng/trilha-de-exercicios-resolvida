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

    @Step("Traduz <numero> para Fizz")
    public void trafuzNumerosFizzCorretamente(int numero) {
        assertThat(tradutor.traduz(numero)).isEqualTo("Fizz");
    }
}
