package topicos_avancados_04.tratando_excecoes;

public class ExemploExcecoesChecadas {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(100);

        try {
            contaCorrente.sacar(60);
        }catch (SaldoInsuficienteException e){
            System.out.println("Desculpe, saldo Insuficiente.");
        }
        System.out.println("Saldo: " + contaCorrente.getSaldo());

        try {
            contaCorrente.sacar(50);
        }catch (SaldoInsuficienteException e){
            System.out.println("Desculpe, saldo Insuficiente.");
        }finally {// sempre e utilizado o finally
            System.out.println("Obrigado por Utilizar nosso Sistema!!");
        }
        System.out.println("Saldo Agora: " + contaCorrente.getSaldo());
    }
}
