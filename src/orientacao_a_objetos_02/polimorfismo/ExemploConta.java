package orientacao_a_objetos_02.polimorfismo;

public class ExemploConta {
    public static void main(String[] args) {


        Conta conta = new Conta();
        conta.setSaldo(4000);
        ExemploConta.imprimirSaldo(conta);

        //----------------------------------------------

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(3500);
        imprimirSaldo(contaCorrente);

        //-----------------------------------------------

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(2000);
        imprimirSaldo(contaPoupanca);


    }

    public static void imprimirSaldo(Conta conta){
        System.out.println("Saldo da Conta: R$ " + conta.getSaldo());
    }
}
