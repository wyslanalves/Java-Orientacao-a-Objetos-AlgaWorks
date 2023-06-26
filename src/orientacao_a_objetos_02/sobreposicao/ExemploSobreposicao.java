package orientacao_a_objetos_02.sobreposicao;

import java.util.Date;

public class ExemploSobreposicao {



    public static void main(String[] args) {
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel();
        produtoPerecivel.descricao = "Caixa de Fósforo";
        produtoPerecivel.dataValidade = new Date();
        produtoPerecivel.identificar();
    }
}
