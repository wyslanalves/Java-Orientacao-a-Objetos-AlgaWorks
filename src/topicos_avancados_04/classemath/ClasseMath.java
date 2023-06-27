package topicos_avancados_04.classemath;
import static java.lang.Math.PI; // com esse importe não preciso colocar o Math.PI, coloco direto o PI

public class ClasseMath {
    public static void main(String[] args) {



        // Comprimento de uma Circuferencia 2 x r x PI
            int raio = 4;
            double comprimento = 2 * raio * PI;
            System.out.println("Comprimento: " + comprimento);


        // Máximo e Minimo

        double[] precosProdutoA = {30.21, 25.49};
        double maoirPreco = Math.max(precosProdutoA[0], precosProdutoA[1]);
        double menorPreco = Math.min(precosProdutoA[0], precosProdutoA[1]);
        System.out.println("Maior Preço: " + maoirPreco);
        System.out.println("Menor Preço: " + menorPreco);

        // Potência

        System.out.println("2^3: " + Math.pow(2, 3));

        // Raiz Quadrada

        System.out.println("Raiz de 9: " + Math.sqrt(9));

        // Arredondamento Ceil, Floor e Round
        double n = 5.68;
        System.out.println("Menor Inteiro: " + Math.floor(n));
        System.out.println("Maior Inteiro: " + Math.ceil(n));
        System.out.println("Arredondando: " + Math.round(n));

        // Trigonometria
        System.out.println("Seno: " + (int)Math.sin(40));

        // Numero Aleatório
        double numeroAleatorio = Math.random() * 100;
        System.out.println(numeroAleatorio);

    }
}
