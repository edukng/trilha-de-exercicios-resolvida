package com.aceleradora.logica;

public class ContadorDeOcorrencias {
    public ContadorDeOcorrencias() {
    }

    public int contaOcorrencias(String texto, String token) {
        int contaToken = 0;
        char comparador = token.charAt(0);

        for(int i = 0; i < texto.length(); ++i) {
            if (texto.charAt(i) == comparador) {
                ++contaToken;
            }
        }

        return contaToken;
    }
}
