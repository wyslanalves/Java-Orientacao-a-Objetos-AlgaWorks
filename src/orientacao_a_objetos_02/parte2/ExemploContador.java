package orientacao_a_objetos_02.parte2;

public class ExemploContador {

    public static void main(String[] args) {
        Contador c = new Contador();
        c.incrementar();
        System.out.println(Contador.connt);
        Contador.connt++;
        System.out.println(c.connt);
    }
}
