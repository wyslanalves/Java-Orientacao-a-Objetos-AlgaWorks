package orientacao_a_objetos_02.abstrata;


public class ProdutoPerecivel extends Produto {

    String descricao;
    String dataValidade;

    @Override
    public void imprimirDescricao() {
        //Digitara Lógica
        System.out.println("Descrição: " + super.getDescricao() + ". Vence em" + dataValidade);
    }
}
