package com.aceleradora.oo.rpg;

public class CriadorDePersonagens {



    public Personagem criarPersonagemDeDefesa() {
        Personagem defesaBuilder = new Personagem();
        defesaBuilder.setNome("Lauri, o místico");
        defesaBuilder.setForca(50);
        defesaBuilder.setAgilidade(30);
        defesaBuilder.setCarisma(2);
        defesaBuilder.setConcentracao(10);
        Armadura armadura = new Armadura();
        armadura.setNome("Armadura de Couro de Capivara");
        armadura.setBonusDeDefesa(50);
        defesaBuilder.setArmadura(armadura);
        Arma arma = new Arma();
        arma.setNome("Faca de cozinha enferrujada");
        arma.setBonusDeAtaque(30);
        defesaBuilder.setArma(arma);

        return defesaBuilder;
    }

    public Personagem criarPersonagemDeAtaque() {
        Personagem ataqueBuilder = new Personagem();
        ataqueBuilder.setNome("Romilda, a destruidora");
        ataqueBuilder.setForca(150);
        ataqueBuilder.setAgilidade(10);
        ataqueBuilder.setCarisma(200);
        ataqueBuilder.setConcentracao(10);
        Armadura armadura = new Armadura();
        armadura.setNome("Armadura de folha de bananeira reforçada");
        armadura.setBonusDeDefesa(100);
        ataqueBuilder.setArmadura(armadura);
        Arma arma = new Arma();
        arma.setNome("Facão três listras lendário");
        arma.setBonusDeAtaque(530);
        ataqueBuilder.setArma(arma);
        return ataqueBuilder;
    }

}
