package topicos_avancados_04.tratando_excecoes;

public class ExemploExcecoes {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(100);
        try{
            cc.depositar(-10);
        }catch (IllegalArgumentException e){
            System.out.println("Você executou uma operação legal: " + e.getMessage());
        }




    }
}
