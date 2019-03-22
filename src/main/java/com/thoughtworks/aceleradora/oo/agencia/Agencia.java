package com.thoughtworks.aceleradora.oo.agencia;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

public class Agencia {

    private final List<Oportunidade> oportunidades = asList(
            new Oportunidade(
                    "Desenvolvedora Java Junior",
                    new Habilidade("Java"),
                    new Habilidade("Spring"),
                    new Habilidade("Feedback"),
                    new Habilidade("Pareamento")
            ),
            new Oportunidade(
                    "Desenvolvedora JavaScript",
                    new Habilidade("JavaScript"),
                    new Habilidade("Express"),
                    new Habilidade("SQL")
            ),
            new Oportunidade(
                    "Auxiliar Administrativo",
                    new Habilidade("Excel"),
                    new Habilidade("Word"),
                    new Habilidade("PowerPoint")
            ),
            new Oportunidade(
                    "Programadora PHP",
                    new Habilidade("PHP"),
                    new Habilidade("Laravel"),
                    new Habilidade("MySQL")
            ),
            new Oportunidade(
                    "Estagio Java",
                    new Habilidade("Java"),
                    new Habilidade("Struts"),
                    new Habilidade("MSSQL")
            ),
            new Oportunidade(
                    "Programadora Python Senior",
                    new Habilidade("Python"),
                    new Habilidade("Django"),
                    new Habilidade("SQLAlchemy")
            )
    );

    public List<Oportunidade> filtrarPorHabilidade(String habilidade) {
        return emptyList();
    }
}
