package orientacao_a_objetos_02.interfaces.teste;

import orientacao_a_objetos_02.interfaces.Impressora;
import orientacao_a_objetos_02.interfaces.caixa.Checkout;
import orientacao_a_objetos_02.interfaces.caixa.Compra;
import orientacao_a_objetos_02.interfaces.impressao.impressoras.ImpressoraEpson;
import orientacao_a_objetos_02.interfaces.pagamento.Cartao;
import orientacao_a_objetos_02.interfaces.pagamento.Operadora;
import orientacao_a_objetos_02.interfaces.pagamento.operadoras.Cielo;

public class TesteCheckout {
    public static void main(String[] args) {
        Operadora operadora = new Cielo();
        Impressora impressora = new ImpressoraEpson();

        Cartao cartao = new Cartao();
        cartao.setNomeTitular("Wyslan M Couves");
        cartao.setNumeroCartao("123");

        Compra compra = new Compra();
        compra.setNomeCliente("Wyslan Mendonça Couves");
        compra.setProduto("Sabonete");
        compra.setValorTotal(2.5);

        Checkout checkout = new Checkout(operadora, impressora);
        checkout.fecharCompra(compra, cartao);
    }


}
