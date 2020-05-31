package com.aceleradora.logica;

public class TradutorFizzBuzz {

    String traduz(int numero) {
        boolean isFizz = numero % 3 == 0;
        boolean isBuzz = numero % 5 == 0;

        if (isFizz && isBuzz) {
            return "FizzBuzz";
        }

        if (isFizz) {
            return "Fizz";
        }

        if (isBuzz) {
            return "Buzz";
        }

        return Integer.toString(numero);
    }
}
