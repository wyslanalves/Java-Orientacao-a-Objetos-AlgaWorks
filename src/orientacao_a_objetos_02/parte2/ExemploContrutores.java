package orientacao_a_objetos_02.parte2;

public class ExemploContrutores {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Wyslan", 29);

        System.out.println("Nome: \"" + p1.nome + "\" tem " + p1.idade + " anos.");

        p1.idade = 28;
        p1.nome = "Pedro";

        System.out.println("Nome: \"" + p1.nome + "\" tem " + p1.idade + " anos.");
    }
}
