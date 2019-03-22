package com.thoughtworks.aceleradora.oo.rpg;

public class CriadorDePersonagens {

    public Personagem criarPersonagemDeDefesa() {
        Personagem personagem = new Personagem();

        personagem.setNome("Gaete, o monstro");
        personagem.setForca(50);
        personagem.setAgilidade(30);
        personagem.setCarisma(2);
        personagem.setConcentracao(10);

        Arma arma = new Arma();

        arma.setNome("Faca de cozinha enferrujada");
        arma.setBonusDeAtaque(30);

        personagem.setArma(arma);

        Armadura armadura = new Armadura();

        armadura.setNome("Armadura de Couro de Capivara");
        armadura.setBonusDeDefesa(50);

        personagem.setArmadura(armadura);

        return personagem;
    }

    public Personagem criarPersonagemDeAtaque() {
        return null;
    }

}
