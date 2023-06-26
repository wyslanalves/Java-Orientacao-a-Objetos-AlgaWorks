package orientacao_a_objetos_02.parte1;

public class Principal1 {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        meuCarro.fabricante = "FIAT";
        meuCarro.modelo = "Palio";
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.cor = "Preto";


        System.out.println("Meu Carro");
        System.out.println("----------------------------------------------");
        System.out.println("Fabricante: " + meuCarro.fabricante);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.anoDeFabricacao);
        System.out.println("Cor: " + meuCarro.cor);

        System.out.println("=============================================");

        Carro seuCarro = new Carro();
        seuCarro.fabricante = "CHEFLOLET";
        seuCarro.modelo = "Gol";
        seuCarro.anoDeFabricacao = 2023;
        seuCarro.cor = "Rosa";

        System.out.println("Seu Carro");
        System.out.println("----------------------------------------------");
        System.out.println("Fabricante: " + seuCarro.fabricante);
        System.out.println("Modelo: " + seuCarro.modelo);
        System.out.println("Ano: " + seuCarro.anoDeFabricacao);
        System.out.println("Cor: " + seuCarro.cor);
    }
}
