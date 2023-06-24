package fundamentos_da_linguagem_01;

import java.util.Scanner;

public class ClausulasBreakContinue {
    public static void main(String[] args) {

        /*
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um Numero: ");
        int divisor = entrada.nextInt();

        for(int i = 100; i <= 200; i++){
            if(i % divisor == 0){
                break;
            }

            System.out.println(i);
        }

        System.out.println("Fim do Programa");
    }

         */

    Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um Numero: ");
        int divisor = entrada.nextInt();

        for(int i = 100; i <= 120; i++){
        if(i % divisor == 0){
            continue;
            }
            System.out.println(i);
        }

        System.out.println("Fim do Programa");
}
}
