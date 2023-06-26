package orientacao_a_objetos_02.sobrecarga;

public class ExemploCadastro {

    public static void main(String[] args) {

        CadastroPessoa cadastro = new CadastroPessoa();

        Pessoa pessoa = new Pessoa("Wyslan", 19);
        cadastro.cadastrar(pessoa);

        //--------------------------------------------------------------------------

        cadastro.cadastrar("Maria", 25);
    }
}
