package wrappers_boxing_e_arrays_03;

public class Arrays {
    public static void main(String[] args) {

        int[] notas = new int[4];
        notas[0] = 10;
        notas[1] = 5;
        notas[2] = 8;
        notas[3] = 9;

        for (int i = 0; i< notas.length; i++){
            System.out.println("Posicao[" + i + "]= " + notas[i]);
        }

        Carro[] carros = new Carro[4];
        String[] string = new String[4];

        carros[0] = new Carro();
        carros[0].anoDeFabricacao = 2011;

        System.out.println("Ano Fabricação: " + carros[0].anoDeFabricacao);

    }
}
