package fundamentos_da_linguagem_01;

import java.util.Scanner;

public class OperadoresDeIncrementoDecremento {
    public static void main(String[] args) {

        int idade = 10;

        //int novaIdade = idade++;// novaIdade ainda continua com 10,
        int novaIdade = ++idade;// novaIdade Incrementa + 1

        //idade = idade + 1;
        //idade +=  1;
        //idade++;
        System.out.println("Nova idade: " + novaIdade);
    }
}
