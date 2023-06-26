package orientacao_a_objetos_02.parte1;

public class Principal3 {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        meuCarro.fabricante = "FIAT";
        meuCarro.modelo = "Palio";
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.cor = "Preto";
        //meuCarro.proprietario.nome = "Wyslan"; Erro NullPointerException, objeto não inicializado

        Proprietario proprietario = new Proprietario();




    }
}
