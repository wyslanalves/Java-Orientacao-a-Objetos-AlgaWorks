package topicos_avancados_04.tratando_excecoes;

public class SaldoInsuficienteException extends  Exception{

    public SaldoInsuficienteException(String menssagem){
        super(menssagem);
    }
}
