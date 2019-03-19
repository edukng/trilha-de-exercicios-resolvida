package com.thoughtworks.aceleradora.oo.mecanica;

public class Carro {

    private Motor motor;
    private Freio freio;

    public Carro(Motor motor, Freio freio) {
        this.motor = motor;
        this.freio = freio;
    }

    public double getVelocidadeMaxima() {
       return 0.00;
    }

    public double getVelocidadeDeDesaceleracao() {
        return 0.00;
    }
}
