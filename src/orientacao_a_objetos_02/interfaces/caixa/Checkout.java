package orientacao_a_objetos_02.interfaces.caixa;

import orientacao_a_objetos_02.interfaces.Impressora;
import orientacao_a_objetos_02.interfaces.pagamento.Cartao;
import orientacao_a_objetos_02.interfaces.pagamento.Operadora;

public class Checkout {

    private Operadora operadora;
    private Impressora impressora;

    public Checkout(Operadora operadora, Impressora impressora) {
        this.operadora = operadora;
        this.impressora = impressora;
    }

    public void fecharCompra(Compra compra, Cartao cartao){
        boolean autorizado = this.operadora.outorizar(compra, cartao);

        if(autorizado){
            this.impressora.imprimir(compra);
        }else {
            System.out.println("Pagamento foi Negado!!");
        }
    }
}
