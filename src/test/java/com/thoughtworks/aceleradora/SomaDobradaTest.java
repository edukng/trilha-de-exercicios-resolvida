package com.thoughtworks.aceleradora;

import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.ContinueOnFailure;
import com.thoughtworks.gauge.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class SomaDobradaTest {

    private SomaDobrada somaDobrada;

    @BeforeStep
    public void config() {
       somaDobrada = new SomaDobrada();
    }

    @Step("Quando a entrada for <valor> e <outroValor>, a saida deve ser <resultadoEsperado>")
    @ContinueOnFailure
    public void verificaSomaDobrada(int valor, int outroValor, int resultadoEsperado) {
        assertThat(somaDobrada.soma(valor, outroValor))
                .as("A soma de %d e %s resulta em %d, mas o resultado esperado e %d",
                        valor,
                        outroValor,
                        somaDobrada.soma(valor, outroValor),
                        resultadoEsperado
                )
                .isEqualTo(resultadoEsperado);
    }
}
