package orientacao_a_objetos_02.parte2;

public class ExemploPessoaBean {
    public static void main(String[] args) {

        PessoaBean pessoaBean = new PessoaBean();
        pessoaBean.setNome("Wyslan");
        pessoaBean.setIdade(29);

        System.out.println(pessoaBean.getNome() + " Tem " + pessoaBean.getIdade());
    }
}
