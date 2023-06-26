package orientacao_a_objetos_02.parte2;

public class ArCondicionado {

    private int temperatura;

    void trocarTemperatura(int temperatura){
        if (temperatura >= 17 && temperatura <=28){
            this.temperatura = temperatura;
        }
    }

    int obterTemperatura(){
        return  temperatura;
    }
}
