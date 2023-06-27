package topicos_avancados_04.hashCode;

import java.util.Set;

public class ExemploHashCode {
    public static void main(String[] args) {
        Set<Aluno> alunos = SimulandoBancoDeDados.buscarAlunos();

        Aluno alunoSorteado = new Aluno("Maria");

        if(alunos.contains(alunoSorteado)){
            System.out.println("Parabéns " + alunoSorteado.getNome() + "! Você ganhou um Brinde");
        }else {
            System.out.println("Aluno cadastrado no banco de dados");
        }
    }
}
