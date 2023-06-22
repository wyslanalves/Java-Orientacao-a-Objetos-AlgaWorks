package fundamentos_da_linguagem_01;

public class OperadoresDeComparacao {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 2;

        boolean maior = b > a;
        boolean maiorOuIgual = b >= a;
        boolean menor = b < a;
        boolean menorOuIqual = b <= 10;
        boolean igual = a == b -c;
        boolean diferente = b != c;

        System.out.println(maior);
        System.out.println(maiorOuIgual);
        System.out.println(menor);
        System.out.println(menorOuIqual);
        System.out.println(igual);
        System.out.println(diferente);

        System.out.println("========================================");

        boolean bloqueado = true;

        bloqueado = !bloqueado;
        System.out.println(bloqueado);

    }
}
