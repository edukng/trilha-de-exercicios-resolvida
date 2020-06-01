package com.aceleradora.oo.conversor;

import java.util.Scanner;

public class Testes {

    public static void main(String[] args) {
        Scanner leitora = new Scanner(System.in);
        Conversor conversor = new Conversor();

        System.out.print("> ");
        String entrada = leitora.nextLine();

        System.out.println(conversor.converter(entrada));
    }
}
