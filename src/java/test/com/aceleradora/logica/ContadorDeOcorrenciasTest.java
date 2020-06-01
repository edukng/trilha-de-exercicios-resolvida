package com.aceleradora.logica;

import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.ContinueOnFailure;
import com.thoughtworks.gauge.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class ContadorDeOcorrenciasTest {

    private ContadorDeOcorrencias contadorDeOcorrencias;

    @BeforeStep
    public void setUp() {
        contadorDeOcorrencias = new ContadorDeOcorrencias();
    }

    @Step("Ao receber o texto <texto> e a busca <token>, o contador deve retornar <ocorrencias>")
    @ContinueOnFailure
    public void deveContarOcorrenciasCorretamente(String texto, String token, int resultadoEsperado) {

        int resultado = contadorDeOcorrencias.contaOcorrencias(texto, token);

        assertThat(resultado)
                .as("Ao receber %s e %s, o contador deveria retornar %d, mas retornou %d", texto, token,
                        resultadoEsperado, resultado)
                .isEqualTo(resultadoEsperado);
    }

}