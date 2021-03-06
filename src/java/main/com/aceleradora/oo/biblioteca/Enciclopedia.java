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
        sextoLivro.setTitulo("Use a cabe??a: Padr??es de projeto");
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
//    Buscar livros lan??ados em 2017
//    Buscar livros lan??ados entre 1920 e 2010
//    Buscar t??tulo do en??simo livro

    public String tituloDoEnesimoLivro(int posicao) {
        return null;
    }

    public List<Livro> livrosDisponiveisEmPdf() {
//        List<Livro> formatoPdf = new ArrayList<>();
//        for (Livro formatoAux: livros) {
//
//            if(formatoAux.equals(Formato.PDF)){
//                formatoPdf.add(formatoAux);
//            }
//        }
//        return formatoPdf;
        List<Livro> livrosEmPdf = new ArrayList<>();
        for (Livro livroAux: livros) {
            for (Formato formatoPdf: livroAux.getFormatos()) {
                if(formatoPdf.equals(Formato.PDF)){
                    livrosEmPdf.add(livroAux);
                }
            }
        }
        return livrosEmPdf;
    }

    public List<Livro> buscaPorAutora(String nomeCompleto) {
//        List<Livro> livrosPorAutor = new ArrayList<>();
//        for(Livro autorAux: livros){
//            for(Autor nomeDoAutor: autorAux.getAutores()){
//                if(nomeDoAutor.equals(nomeCompleto)){
//                    livrosPorAutor.add(autorAux);
//                }
//
//            }
//        }
//        return livrosPorAutor;
        List<Livro> listaChimamanda = new ArrayList<>();
        for (Livro livroAux: livros) {
            for (Autor autora: livroAux.getAutores()) {
                if(autora.toString().equals(nomeCompleto)){
                    listaChimamanda.add(livroAux);
                }
            }
        }
        return listaChimamanda;
    }

    public List<Livro> buscaPorAnoDeLancamento(int ano) {
        List<Livro> livrosPorAno = new ArrayList<>();
        for (Livro livroAux: livros) {
            if(livroAux.getAnoDeLancamento() == ano){
                livrosPorAno.add(livroAux);
            }
        }
        return livrosPorAno;



    }

    public List<Livro> buscaPorPeriodoDeLancamento(int inicio, int fim) {
        List<Livro> livrosPorPeriodo = new ArrayList<>();
        for (Livro livroAux: livros) {
            if(livroAux.getAnoDeLancamento() >= inicio && livroAux.getAnoDeLancamento() <= fim){
                livrosPorPeriodo.add(livroAux);
            }
        }
        return livrosPorPeriodo;
    }

}
