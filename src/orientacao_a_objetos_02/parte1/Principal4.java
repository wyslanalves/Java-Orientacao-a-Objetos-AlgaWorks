package orientacao_a_objetos_02.parte1;

public class Principal4 {
    public static void main(String[] args) {

        Proprietario proprietario1 = new Proprietario();
        proprietario1.nome = "Wyslan Da Silva";

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Palio";
        meuCarro.proprietario = proprietario1;

        Carro seuCarro = new Carro();
        seuCarro.modelo = "Civic";
        seuCarro.proprietario = proprietario1;

        System.out.println("Antes da Mudança");
        System.out.println(meuCarro.proprietario.nome);
        System.out.println(seuCarro.proprietario.nome);
        System.out.println(proprietario1.nome);
        System.out.println();
        System.out.println("Depois da Mudança");
        meuCarro.proprietario.nome = "Sebastião";
        System.out.println(meuCarro.proprietario.nome);
        System.out.println(seuCarro.proprietario.nome);
        System.out.println(proprietario1.nome);



    }
}
