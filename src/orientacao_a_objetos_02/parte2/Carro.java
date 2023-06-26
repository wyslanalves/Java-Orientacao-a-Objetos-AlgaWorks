package orientacao_a_objetos_02.parte2;

import orientacao_a_objetos_02.parte1.Proprietario;

public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricacao;
    boolean biCombustivel;

    Proprietario proprietario;

    void ligar(){
        if(modelo != null){
            System.out.println("Lingando o Carro: " + modelo);
        }
    }

    void alterarModelo(String modelo){
        if(modelo != null){
            this.modelo = modelo;
        }
    }


}
