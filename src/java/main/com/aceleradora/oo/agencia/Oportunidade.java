package com.aceleradora.oo.agencia;

import java.util.List;

import static java.util.Arrays.asList;

public class Oportunidade {

    private String titulo;

    private List<Habilidade> habilidadesEsperadas;

    public Oportunidade(String titulo, Habilidade ... habilidades) {
        this.titulo = titulo;
        this.habilidadesEsperadas = asList(habilidades);
    }
}
