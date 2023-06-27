package orientacao_a_objetos_02.interfaces.pagamento.operadoras;

import orientacao_a_objetos_02.interfaces.pagamento.Autorizavel;
import orientacao_a_objetos_02.interfaces.pagamento.Cartao;
import orientacao_a_objetos_02.interfaces.pagamento.Operadora;

public class Cielo implements Operadora {

    @Override
    public boolean outorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("123")
                && autorizavel.getValorTotal() < 100;
    }
}
