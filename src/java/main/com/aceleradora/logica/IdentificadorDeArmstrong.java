package com.aceleradora.logica;

public class IdentificadorDeArmstrong {

    public String identificaNumero(int numero) {
        int resultado = 0;
        double resultadoFinal = 0;
        int casaDecimal = 0;

        String pegaNumero = String.valueOf(numero); // transforma Int em String

        String separaNumero [] = pegaNumero.split(""); //Fatia a String
        int expoente = separaNumero.length; //Pega o tamanho da String para Usar como Expoente

        for(int i = 0; i < separaNumero.length; i++) {
            casaDecimal = Integer.parseInt(separaNumero[i]); //Pega as fatias da String e Converte pra Int
            resultadoFinal = Math.pow(casaDecimal,expoente) + resultadoFinal;

        }

        if(numero == resultadoFinal){
            return "Este eh um numero de Armstrong!";

        }
        else{
            return "Este nao eh um numero de Armstrong!";

        }

    }
}