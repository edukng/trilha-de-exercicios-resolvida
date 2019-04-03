package com.thoughtworks.aceleradora.oo.biblioteca;

import com.thoughtworks.aceleradora.ImplementacaoIncorreta;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.ContinueOnFailure;
import com.thoughtworks.gauge.Step;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import static com.thoughtworks.aceleradora.checkers.AttributeExtractor.getAttributeValue;
import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

public class EnciclopediaTest {

    private Enciclopedia enciclopedia;

    @BeforeStep
    public void setUp() {
        enciclopedia = new Enciclopedia();
    }

    @Step("O livro <indice> foi escrito por <autor>, seu título é <titulo> e foi lançado em <ano>. O livro está disponível nos formatos <formatos>")
    @ContinueOnFailure
    public void bookIsCorrectlyCreatedAndPositioned(int indice, String autores, String titulo, int ano, String formatos) {
        positionalAssert(indice, autores, titulo, ano, formatos, getAttributeValue(enciclopedia, "livros"));
    }

    @Step("O método tituloDoEnesimoLivro retorna o título <titulo> quando o índice pesquisado for <indice>")
    @ContinueOnFailure
    public void findsTitleByIndex(String titulo, int indice) {
      assertThat(enciclopedia.tituloDoEnesimoLivro(indice)).isEqualTo(titulo);
    }

    @Step("O livro <indice> retornado por livrosDisponiveisEmPdf foi escrito por <autores>, seu título é <titulo> e foi lançado em <ano>. O livro está disponível nos formatos <formatos>")
    @ContinueOnFailure
    public void pdfSearchIsCorrectlyImplemented(int indice, String autores, String titulo, int ano, String formatos) {
        positionalAssert(indice, autores, titulo, ano, formatos, enciclopedia.livrosDisponiveisEmPdf());
    }

    @Step("O livro <indice> retornado por buscaPorAutora foi escrito por <autores>, seu título é <titulo> e foi lançado em <ano>. O livro está disponível nos formatos <formatos>")
    @ContinueOnFailure
    public void authorSearchIsCorrectlyImplemented(int indice, String autores, String titulo, int ano, String formatos) {
        positionalAssert(indice, autores, titulo, ano, formatos, enciclopedia.buscaPorAutora("Chimamanda Adichie"));
    }

    @Step("O livro <indice> retornado por buscaPorAnoDeLancamento foi escrito por <autores>, seu título é <titulo> e foi lançado em <ano>. O livro está disponível nos formatos <formatos>")
    @ContinueOnFailure
    public void yearSearchIsCorrectlyImplemented(int indice, String autores, String titulo, int ano, String formatos) {
        positionalAssert(indice, autores, titulo, ano, formatos, enciclopedia.buscaPorAnoDeLancamento(2017));
    }

    @Step("O livro <indice> retornado por buscaPorPeriodoDeLancamento foi escrito por <autores>, seu título é <titulo> e foi lançado em <ano>. O livro está disponível nos formatos <formatos>")
    @ContinueOnFailure
    public void periodSearchIsCorrectlyImplemented(int indice, String autores, String titulo, int ano, String formatos) {
        positionalAssert(indice, autores, titulo, ano, formatos, enciclopedia.buscaPorPeriodoDeLancamento(1920, 2010));
    }

    private void positionalAssert(int index, String expectedAuthors, String expectedTitle, Integer expectedYear, String expectedFormats, List<Livro> books) {

        if (books == null) {
            throw new ImplementacaoIncorreta("O metodo retornou o valor nulo, quando deveria retornar uma lista");
        }

        Livro livro = books.get(index);

        if (livro == null) {
            throw new ImplementacaoIncorreta(String.format("O valor da posicao %d é nulo.", index));
        }

        String title = getAttributeValue(livro, "titulo");
        Integer year = getAttributeValue(livro, "ano");
        List<Autor> authors = getAttributeValue(livro, "autores");
        List<Formato> formats = getAttributeValue(livro, "formatos");

        assertThat(title).isEqualTo(expectedTitle);
        assertThat(year).isEqualTo(expectedYear);
        assertThat(authors).isEqualTo(parsedExpectedValues(expectedAuthors, this::toAutor));
        assertThat(formats).isEqualTo(parsedExpectedValues(expectedFormats, Formato::valueOf));
    }

    private Autor toAutor(String value) {
        String[] authorValues = value.split(" ");

        return new Autor(authorValues[0], authorValues[1]);
    }

    private <T> List<T> parsedExpectedValues(String values, Function<String, T> mapper) {
        return Stream.of(values.split(", ")).map(mapper).collect(toList());
    }

}
