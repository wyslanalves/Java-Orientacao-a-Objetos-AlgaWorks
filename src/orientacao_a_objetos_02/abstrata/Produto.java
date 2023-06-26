package orientacao_a_objetos_02.abstrata;

public abstract class Produto {

    String descricao;

    public abstract void imprimirDescricao();

    public String getDescricao(){
        return descricao;
    }
}
