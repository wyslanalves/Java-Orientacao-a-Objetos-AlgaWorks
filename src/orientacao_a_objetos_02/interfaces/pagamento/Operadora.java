package orientacao_a_objetos_02.interfaces.pagamento;

public interface Operadora {

    public boolean outorizar(Autorizavel autorizavel, Cartao cartao);
}
