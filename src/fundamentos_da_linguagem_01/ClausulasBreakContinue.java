package fundamentos_da_linguagem_01;

import java.util.Scanner;

public class ClausulasBreakContinue {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ultimo numero: ");
        int numeroFinal = entrada.nextInt();

        for(int i = 1; i <= numeroFinal; i++){
            System.out.println(i);
        }
    }
}
