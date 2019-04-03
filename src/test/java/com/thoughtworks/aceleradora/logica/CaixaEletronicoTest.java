package com.thoughtworks.aceleradora.logica;

import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.ContinueOnFailure;
import com.thoughtworks.gauge.Step;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CaixaEletronicoTest {

    private CaixaEletronico caixaEletronico;

    @BeforeStep
    public void setUp() {
        caixaEletronico = new CaixaEletronico();
    }

    @Step("Quando o valor do saque for <valor>, o caixa deve entregar <notas>")
    @ContinueOnFailure
    public void shouldDeliverCorrectBills(int valor, String notas) throws Exception {
        List<Integer> notasEsperadas = Stream
                .of(notas.split(","))
                .map(String::trim)
                .map(Integer::parseInt).collect(toList());

        List<Integer> notasRetornadas = caixaEletronico.sacar(valor);

        assertThat(notasRetornadas).isEqualTo(notasEsperadas);
    }

    @Step("Quando o valor do saque for <valor>, o caixa deve lançar exceção com mensagem <mensagem>")
    @ContinueOnFailure
    public void shouldFailWhenAskedForInvalidValue(int valor, String mensagem) throws Exception {
        assertThatThrownBy(() -> caixaEletronico.sacar(valor)).hasMessage(mensagem);
    }

}