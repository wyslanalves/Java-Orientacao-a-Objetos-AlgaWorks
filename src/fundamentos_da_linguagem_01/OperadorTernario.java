package fundamentos_da_linguagem_01;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua Idade: ");
        int idade = entrada.nextInt();
                            //expressao booleana    valor caso verdadeiro             valor caso false
        String indicacao = (idade >= 18)                ? "Adulto"               : "Criança/Adolescente";



        /*
        if (idade >= 18){
            indicacao = "Adulto";
        }else {
            indicacao = "Criança/Adolescente";
        }
        */

            System.out.println("Resultado: " + indicacao);
    }
}
