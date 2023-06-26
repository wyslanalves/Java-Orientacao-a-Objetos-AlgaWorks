package orientacao_a_objetos_02.parte2;

import orientacao_a_objetos_02.enums.Naipe;

public class ExemploEnum {



    public static void main(String[] args) {
        Carta quatroPaus = new Carta(4, Naipe.PAUS);
        quatroPaus.imprimirCarta();
    }
}
