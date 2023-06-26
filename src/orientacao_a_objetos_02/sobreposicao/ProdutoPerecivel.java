package orientacao_a_objetos_02.sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto{


    protected Date dataValidade;

    public void indetificar(){
        super.identificar();
        System.out.println("Minha data de validade é: " + dataValidade);
    }
}
