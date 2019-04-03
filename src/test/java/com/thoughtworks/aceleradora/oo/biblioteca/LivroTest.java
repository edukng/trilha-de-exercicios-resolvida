package com.thoughtworks.aceleradora.oo.biblioteca;

import com.thoughtworks.aceleradora.ImplementacaoIncorreta;
import com.thoughtworks.gauge.ContinueOnFailure;
import com.thoughtworks.gauge.Step;

import java.util.List;

import static com.thoughtworks.aceleradora.checkers.AttributeExtractor.getAttributeValue;
import static com.thoughtworks.aceleradora.checkers.MethodConstraint.Builder.getterFor;
import static com.thoughtworks.aceleradora.checkers.MethodConstraint.Builder.setterFor;
import static com.thoughtworks.aceleradora.checkers.QueryBuilder.query;
import static com.thoughtworks.aceleradora.oo.biblioteca.Formato.PDF;
import static org.assertj.core.api.Assertions.assertThat;

public class LivroTest {

    @Step("A lista de formatos deve ser instanciada no construtor da classe Livro")
    @ContinueOnFailure
    public void formatsListShouldBeInstantiatedAtConstructor() {
        if (getAttributeValue(new Livro(), "autores") == null) {
            throw new ImplementacaoIncorreta("A lista de autores e nula. Ela deve ser instanciada no construtor da classe Livro");
        }
    }

    @Step("A lista de autores deve ser instanciada no construtor da classe Livro")
    @ContinueOnFailure
    public void authorsListShouldBeInstantiatedAtConstructor() {
        if (getAttributeValue(new Livro(), "formatos") == null) {
            throw new ImplementacaoIncorreta("A lista de formatos e nula. Ela deve ser instanciada no construtor da classe Livro");
        }
    }

    @Step("A classe livro deve ter o método getAutores")
    @ContinueOnFailure
    public void mustHaveGetAutores() {
        query(Livro.class)
                .method(getterFor("autores"))
                .check();
    }

    @Step("A classe livro deve ter o método getFormatos")
    @ContinueOnFailure
    public void mustHaveGetFormatos() {
        query(Livro.class)
                .method(getterFor("formatos"))
                .check();
    }

    @Step("A classe livro deve ter o método getTitulo")
    @ContinueOnFailure
    public void mustHaveGetTitulo() {
        query(Livro.class)
                .method(getterFor("titulo"))
                .check();
    }

    @Step("A classe livro deve ter o método setTitulo")
    @ContinueOnFailure
    public void mustHaveSetTitulo() {
        query(Livro.class)
                .method(setterFor("titulo"))
                .check();
    }

    @Step("A classe livro deve ter o método getAnoDeLancamento")
    @ContinueOnFailure
    public void mustHaveGetAnoDeLancamento() {
        query(Livro.class)
                .method(getterFor("anoDeLancamento"))
                .check();
    }

    @Step("A classe livro deve ter o método setAnoDeLancamento")
    @ContinueOnFailure
    public void mustHaveSetAnoDeLancamento() {
        query(Livro.class)
                .method(setterFor("anoDeLancamento"))
                .check();
    }

    @Step("Quando o método adicionarAutor receber por parâmetro a autora Chimamanda Adichie, o primeiro item da lista de autores do livro deve ser Chimamanda Adichie")
    @ContinueOnFailure
    public void mustAddAuthor() {
        Livro book = new Livro();

        book.adicionarAutor(new Autor("Chimamanda", "Adichie"));

        List<Autor> authors = getAttributeValue(book, "autores");

        if (authors == null) {
            throw new ImplementacaoIncorreta("A lista de autores e nula. Ela deve ser instanciada no construtor da classe Livro");
        }

        assertThat(authors).containsExactly(new Autor("Chimamanda", "Adichie"));
    }

    @Step("Quando o método adicionarFormato receber por parâmetro o formato PDF, o primeiro item da lista de formatos do livro deve ser PDF")
    @ContinueOnFailure
    public void mustAddFormat() {
        Livro book = new Livro();

        book.adicionarFormato(PDF);

        List<Formato> formats = getAttributeValue(book, "formatos");

        if (formats == null) {
            throw new ImplementacaoIncorreta("A lista de formatos e nula. Ela deve ser instanciada no construtor da classe Livro");
        }

        assertThat(formats).containsExactly(PDF);
    }

}