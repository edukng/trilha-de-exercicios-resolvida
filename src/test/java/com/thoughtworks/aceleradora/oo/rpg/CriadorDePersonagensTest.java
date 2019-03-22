package com.thoughtworks.aceleradora.oo.rpg;

import com.thoughtworks.gauge.*;

import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;

public class CriadorDePersonagensTest {

    private Personagem personagemAtual;

    @BeforeScenario
    public void setUp(ExecutionContext context) {
        CriadorDePersonagens criadorDePersonagens = new CriadorDePersonagens();

        String scenario = context.getCurrentScenario().getName();

        if (scenario.equals("Personagem de Defesa")) {
            personagemAtual = criadorDePersonagens.criarPersonagemDeDefesa();
        }

        if (scenario.equals("Personagem de Ataque")) {
            personagemAtual = criadorDePersonagens.criarPersonagemDeAtaque();
        }
    }

    private <T> void verificaAtributo(String nomeDoAtributo, T valorEsperado, Supplier<T> atributo) {
        assertThat(atributo.get())
                .as("O atributo %s deveria ter valor %d, mas possui %d",
                        nomeDoAtributo, valorEsperado, atributo.get())
                .isEqualTo(valorEsperado);
    }

    @Step("Seu nome é <nomeEsperado>")
    @ContinueOnFailure
    public void possuiNomeCorreto(String nomeEsperado) {
        verificaAtributo("nome", nomeEsperado, () -> personagemAtual.getNome());
    }

    @Step("Possui <pontos> pontos de forca")
    @ContinueOnFailure
    public void possuiForcaEsperada(int pontos) {
        verificaAtributo("forca", pontos, () -> personagemAtual.getForca());
    }

    @Step("Possui <pontos> pontos de agilidade")
    @ContinueOnFailure
    public void possuiAgilidadeEsperada(int pontos) {
        verificaAtributo("agilidade", pontos, () -> personagemAtual.getAgilidade());
    }

    @Step("Possui <pontos> pontos de carisma")
    @ContinueOnFailure
    public void possuiCarismaEsperado(int pontos) {
        verificaAtributo("carisma", pontos, () -> personagemAtual.getCarisma());
    }

    @Step("Possui <pontos> pontos de concentracao")
    @ContinueOnFailure
    public void possuiConcentracaoEsperada(int pontos) {
        verificaAtributo("concentracao", pontos, () -> personagemAtual.getConcentracao());
    }

    @Step("Sua arma se chama <nome> e entrega um bônus de <bonus> pontos de ataque")
    @ContinueOnFailure
    public void possuiArmaCorreta(String nome, int bonus) {
        Arma arma = personagemAtual.getArma();

        assertThat(arma.getNome()).isEqualTo(nome);
        assertThat(arma.getBonusDeAtaque()).isEqualTo(bonus);
    }

    @Step("Sua armadura se chama <nome> e entrega um bônus de <bonus> pontos de defesa")
    @ContinueOnFailure
    public void possuiArmaduraCorreta(String nome, int bonus) {
        Armadura armadura = personagemAtual.getArmadura();

        assertThat(armadura.getNome()).isEqualTo(nome);
        assertThat(armadura.getBonusDeDefesa()).isEqualTo(bonus);
    }
}