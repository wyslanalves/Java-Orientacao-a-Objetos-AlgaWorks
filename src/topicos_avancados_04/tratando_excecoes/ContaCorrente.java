package topicos_avancados_04.tratando_excecoes;

public class ContaCorrente {

    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposita){
        if(deposita <= 0){
            throw new IllegalArgumentException("O valor não pode ser menor que 0");
        }
        this.saldo += deposita;
    }

    public void sacar(double quantidade) throws SaldoInsuficienteException{
        double saldoTemp = saldo - quantidade;
        if (saldoTemp < 0){
            throw new SaldoInsuficienteException("Voce não possui saldo suficiente");
        }
        this.saldo -= quantidade;
    }

    public double getSaldo(){
        return this.saldo;
    }
}
