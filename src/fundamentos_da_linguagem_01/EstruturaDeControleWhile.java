package fundamentos_da_linguagem_01;

import java.util.Scanner;

public class EstruturaDeControleWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o Numero Inicial: ");
        int numeroInicial = entrada.nextInt();

        System.out.println("Digite o Numero Final: ");
        int numeroFinal = entrada.nextInt();

        int numeroAtual = numeroInicial;

        while (numeroAtual <= numeroFinal){
            System.out.println(numeroAtual);
            numeroAtual++;
        }
    }
}
