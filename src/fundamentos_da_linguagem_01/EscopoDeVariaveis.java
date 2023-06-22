package fundamentos_da_linguagem_01;

import java.util.Scanner;

public class EscopoDeVariaveis {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Idade/; ");
        int idade = entrada.nextInt();

        boolean podeDirigir = idade >= 18;
        String nomePai = "";
        if(!podeDirigir){
            System.out.println("Nome do pai: ");

            nomePai =  entrada.next();
        }

        System.out.println("Você pode Dirigir?");

        if(podeDirigir){
            System.out.println("Sim, Claro");
        }else {
            System.out.println("Não, se fizer isso, seu pai " + nomePai + "vai preso");
        }
    }
}
