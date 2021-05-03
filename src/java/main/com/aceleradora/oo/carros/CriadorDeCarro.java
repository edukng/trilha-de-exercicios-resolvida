package com.aceleradora.oo.carros;

public class CriadorDeCarro {

    public Carro criaUmCarro() {
        Carro montador = new Carro();
        montador.setMarca("Ford");
        montador.setModelo("Mustang");
        montador.setAno(2017);
        return montador;
    }

}
