package orientacao_a_objetos_02.parte1;

public class Principal6 {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Palio";

        Carro seuCarro = new Carro();
        seuCarro.modelo = "Civic";

        meuCarro.ligar();
        seuCarro.ligar();
    }
}
