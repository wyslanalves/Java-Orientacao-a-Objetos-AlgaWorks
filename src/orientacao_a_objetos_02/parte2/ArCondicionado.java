package orientacao_a_objetos_02.parte2;

public class ArCondicionado {

    private int temperatura;

    public void trocarTemperatura(int temperatura){
        if (temperatura >= 17 && temperatura <=28){
            this.temperatura = temperatura;
        }
    }

    public int obterTemperatura(){
        return  temperatura;
    }
}
