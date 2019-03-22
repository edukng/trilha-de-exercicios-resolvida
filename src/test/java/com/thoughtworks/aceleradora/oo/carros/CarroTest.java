package com.thoughtworks.aceleradora.oo.carros;

import com.thoughtworks.aceleradora.ImplementacaoIncorreta;
import com.thoughtworks.aceleradora.ReflectiveVerifier;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.ContinueOnFailure;
import com.thoughtworks.gauge.Step;

import java.lang.reflect.Field;
import java.util.Optional;

import static java.util.stream.Collectors.joining;

public class CarroTest {

    private ReflectiveVerifier<Carro> verifier;

    @BeforeStep
    public void setUp() {
        verifier = new ReflectiveVerifier<>(Carro.class);
    }

    private ImplementacaoIncorreta atributoNaoEncontrado(String nome) {
        String atributosDeclarados = verifier.fieldCount() == 0
                ? "Nenhum atributo foi declarado nesta classe ainda."
                : String.format("Os atributos declarados nesta classe sao os seguintes: %s", verifier.fieldNames()
                .collect(joining(", ")));

        String mensagemDeErro = String.format("A classe carro deve possuir o atributo \"%s\". %s",
                nome, atributosDeclarados);

        throw new ImplementacaoIncorreta(mensagemDeErro);
    }

    private ImplementacaoIncorreta tipoIncorreto(String atributo, String tipoEsperado, String tipoEncontrado) {
        String mensagem = String.format("O atributo %s deve ser do tipo %s, mas foi declarado como %s", atributo, tipoEsperado, tipoEncontrado);

        return new ImplementacaoIncorreta(mensagem);
    }

    @Step("Adicione à classe carro o atributo <atributo> do tipo <tipo>")
    @ContinueOnFailure
    public void carroPossuiMarca(String atributo, String tipo) {

        Optional<Field> resultadoBuscaCampo = verifier.findField(atributo);

        if (resultadoBuscaCampo.isEmpty()) {
            throw atributoNaoEncontrado(atributo);
        }

        String tipoEncontrado = resultadoBuscaCampo.get().getType().getSimpleName();

        if (!tipo.equals(tipoEncontrado)) {
            throw tipoIncorreto(atributo, tipo, tipoEncontrado);

        }
    }

}