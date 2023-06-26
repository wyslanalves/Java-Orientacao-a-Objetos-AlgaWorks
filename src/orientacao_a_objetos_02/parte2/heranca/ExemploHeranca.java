package orientacao_a_objetos_02.parte2.heranca;

public class ExemploHeranca {

    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        jogador.nome = "Wyslan";
        jogador.idade = 12;
        jogador.setApresentar();

        Tecnico tecnico = new Tecnico();
        tecnico.nome = "Toninho";
        tecnico.idade = 18;
    }
}
