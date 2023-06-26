package orientacao_a_objetos_02.parte2;

public class ExemploEncapsulamentoModificadorPublicPrivate {

    public static void main(String[] args) {

        ArCondicionado arCondicionado = new ArCondicionado();

        arCondicionado.trocarTemperatura(21);
        System.out.println("Temperatuda do Ar: " + arCondicionado.obterTemperatura() + "º");

        arCondicionado.trocarTemperatura(27);
        System.out.println("Temperatuda do Ar: " + arCondicionado.obterTemperatura() + "º");

    }
}
