package orientacao_a_objetos_02.abstrata;



public class ExemploSobreposicao {

    public static void main(String[] args) {
        Produto produto = new ProdutoPerecivel();
        produto.descricao = "Caixa de Leite";

        ProdutoPerecivel produtoPerecivel = (ProdutoPerecivel) produto;
        produtoPerecivel.dataValidade = "10/03/12";

        produto.imprimirDescricao();
    }



}
