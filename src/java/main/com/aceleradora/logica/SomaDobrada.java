//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.aceleradora.logica;

public class SomaDobrada {
    public SomaDobrada() {
    }

    public int soma(int umValor, int outroValor) {
        if (umValor == outroValor) {
            return (umValor + outroValor) * 2;
        } else {
            return umValor >= 1 && outroValor >= 1 ? umValor + outroValor : -1;
        }
    }
}
