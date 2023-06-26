package orientacao_a_objetos_02.parte1;

public class Principal2 {
    public static void main(String[] args) {

        Proprietario proprietario = new Proprietario();
        proprietario.nome = "Wyslan da silva";
        proprietario.idade = 29;
        proprietario.cpf = "000.000.000-00";
        proprietario.logradouro = "Rua O Combate";
        proprietario.cidade = "Santa Rita";

        Carro meuCarro = new Carro();
        meuCarro.fabricante = "FIAT";
        meuCarro.modelo = "Palio";
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.cor = "Preto";
        meuCarro.proprietario = proprietario;
    }
}
