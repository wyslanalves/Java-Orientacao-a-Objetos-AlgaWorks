package wrappers_boxing_e_arrays_03;

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


}
