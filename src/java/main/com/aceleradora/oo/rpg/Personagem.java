package com.aceleradora.oo.rpg;

public class Personagem {

    private int forca;
    private int agilidade;
    private int carisma;
    private int concentracao;

    private String nome;
    private Arma arma;
    private Armadura armadura;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getConcentracao() {
        return concentracao;
    }

    public void setConcentracao(int concentracao) {
        this.concentracao = concentracao;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }


}
