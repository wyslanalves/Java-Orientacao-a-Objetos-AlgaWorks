package fundamentos_da_linguagem_01;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int soma = 2 + 10;
        int subtracao = 6 - 10;
        int multiplicacao = 8 * 3;
        int divisao = 8 / 2;
        int resto = 7 % 2;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(resto);

        System.out.println("===========================");

        int notaAluno1 = 99;
        int notaAluno2 = 80;
        int notaAluno3 = 53;

        int somaTotal = notaAluno1 + notaAluno2 + notaAluno3;
        System.out.println("Total Geral " + somaTotal);

        int MediaTotal = (notaAluno1 + notaAluno2 + notaAluno3) / 3;
        System.out.println("Média Geral " + MediaTotal);
    }
}
