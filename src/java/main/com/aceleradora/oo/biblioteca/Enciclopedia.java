package com.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Enciclopedia {

    private List<Livro> livros = new ArrayList<>();

    public Enciclopedia() {
        Livro primeiroLivro = new Livro();
        Autor chimamanda = new Autor("Chimamanda","Adichie");
        primeiroLivro.setTitulo("Sejamos todos feministas");
        primeiroLivro.setAnoDeLancamento(2014);
        primeiroLivro.adicionarFormato(Formato.EBOOK);
        primeiroLivro.adicionarAutor(chimamanda);
        livros.add(primeiroLivro);

        Livro segundoLivro = new Livro();
        Autor alejandro = new Autor("Alejandro", "Olchik");
        segundoLivro.setTitulo("Management 3.0");
        segundoLivro.setAnoDeLancamento(2017);
        segundoLivro.adicionarFormato(Formato.PDF);
        segundoLivro.adicionarFormato(Formato.FISICO);
        segundoLivro.adicionarAutor(alejandro);
        livros.add(segundoLivro);

        Livro terceiroLivro= new Livro();
        Autor george = new Autor("George", "Orwell");
        terceiroLivro.setTitulo("1984");
        terceiroLivro.setAnoDeLancamento(1948);
        terceiroLivro.adicionarFormato(Formato.PDF);
        terceiroLivro.adicionarFormato(Formato.FISICO);
        terceiroLivro.adicionarFormato(Formato.EBOOK);
        terceiroLivro.adicionarAutor(george);
        livros.add(terceiroLivro);

        Livro quartoLivro= new Livro();
        Autor julia = new Autor("Julia", "Naomi");
        quartoLivro.setTitulo("Lean Game Development");
        quartoLivro.setAnoDeLancamento(2017);
        quartoLivro.adicionarFormato(Formato.PDF);
        quartoLivro.adicionarFormato(Formato.EBOOK);
        quartoLivro.adicionarAutor(julia);
        livros.add(quartoLivro);

        Livro quintoLivro= new Livro();
        Autor eduardo = new Autor("Eduardo", "Galeano");
        quintoLivro.setTitulo("Las venas abiertas de Latinoamerica");
        quintoLivro.setAnoDeLancamento(1971);
        quintoLivro.adicionarFormato(Formato.FISICO);
        quintoLivro.adicionarFormato(Formato.PDF);
        quintoLivro.adicionarFormato(Formato.EBOOK);
        quintoLivro.adicionarAutor(eduardo);
        livros.add(quintoLivro);

        Livro sextoLivro= new Livro();
        Autor primeiraAutora = new Autor("Kathy", "Sierra");
        Autor segundaAutora = new Autor("Elizabeth", "Freeman");
        sextoLivro.setTitulo("Use a cabeça: Padrões de projeto");
        sextoLivro.setAnoDeLancamento(2004);
        sextoLivro.adicionarFormato(Formato.FISICO);
        sextoLivro.adicionarFormato(Formato.PDF);
        sextoLivro.adicionarAutor(primeiraAutora);
        sextoLivro.adicionarAutor(segundaAutora);
        livros.add(sextoLivro);

        Livro setimoLivro= new Livro();


        setimoLivro.setTitulo("Americanah");
        setimoLivro.setAnoDeLancamento(2013);
        setimoLivro.adicionarFormato(Formato.EBOOK);
        setimoLivro.adicionarFormato(Formato.PDF);
        setimoLivro.adicionarFormato(Formato.FISICO);
        setimoLivro.adicionarAutor(chimamanda);
        livros.add(setimoLivro);

    }
//    Buscar livros disponiveis em PDF
//    Buscar livros da autora Chimamanda Adichie
//    Buscar livros lançados em 2017
//    Buscar livros lançados entre 1920 e 2010
//    Buscar título do enésimo livro

    public String tituloDoEnesimoLivro(int posicao) {
        return null;
    }

    public List<Livro> livrosDisponiveisEmPdf() {
        return null;
    }

    public List<Livro> buscaPorAutora(String nomeCompleto) {
        return null;
    }

    public List<Livro> buscaPorAnoDeLancamento(int ano) {
        if(ano == 2017){
            return livros[1];
        }

    }

    public List<Livro> buscaPorPeriodoDeLancamento(int inicio, int fim) {
        return null;
    }

}
