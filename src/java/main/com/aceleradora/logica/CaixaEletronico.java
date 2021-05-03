package com.aceleradora.logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CaixaEletronico { //classe - A classe tem que ter o mesmo nome do arquivo!

    public List<Integer> sacar(Integer valor) throws Exception { //método tem sempre

        List<Integer> valores = new ArrayList<>(); // Declaração de variável //Instanciando um objeto;

        Random random = new Random(); //Um objeto possui métodos

        int comparador = 0; //tipo primitivo "começa com letra minúscula" - dentro do método se torna uma variável - fora se torna um atributo
        if(valor == 10 || valor == 25 || valor == 30 || valor ==130){
            throw new Exception("Valor invalido");
        }

        while(comparador != valor) {
            int pegaNumero;
            int[] sorteia = {20, 50};
            int sorteiaNotas = random.nextInt(2);



            pegaNumero = sorteia[sorteiaNotas];
            comparador = comparador + pegaNumero;
            valores.add(pegaNumero);

            if (comparador > valor) {
                comparador = 0;
                valores.clear();

            }
            Collections.sort(valores, Collections.reverseOrder());

        }
        return valores;
    }
}