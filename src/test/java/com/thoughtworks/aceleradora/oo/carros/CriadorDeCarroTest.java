package com.thoughtworks.aceleradora.oo.carros;

import com.thoughtworks.aceleradora.ImplementacaoIncorreta;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.ContinueOnFailure;
import com.thoughtworks.gauge.Step;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;

public class CriadorDeCarroTest {

    private CriadorDeCarro criadorDeCarro;

    @BeforeStep
    public void setUp() {
        criadorDeCarro = new CriadorDeCarro();
    }

    @Step("A marca do carro deve ser <marca>")
    @ContinueOnFailure
    public void hasCorrectBrand(String brand) {
        hasAttributeWithValue("marca", brand);
    }

    @Step("O modelo do carro deve ser <model>")
    @ContinueOnFailure
    public void hasCorrectModel(String model) {
        hasAttributeWithValue("modelo", model);
    }

    @Step("O ano do carro deve ser <year>")
    @ContinueOnFailure
    public void hasCorrectYear(int year) {
        hasAttributeWithValue("ano", year);
    }

    private <T> void hasAttributeWithValue(String attribute, T value) {
        Carro carro = criadorDeCarro.criaUmCarro();

        if (carro == null) {
            throw new ImplementacaoIncorreta("Nenhum carro foi criado no metodo criaUmCarro da classe CriadorDeCaro");
        }

        assertThat(carro)
                .extracting(attribute)
                .isEqualTo(singletonList(value));
    }
}