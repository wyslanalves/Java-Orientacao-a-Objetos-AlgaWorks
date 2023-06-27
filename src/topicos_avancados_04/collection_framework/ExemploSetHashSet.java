package topicos_avancados_04.collection_framework;

import java.util.HashSet;
import java.util.Set;

public class ExemploSetHashSet {
    public static void main(String[] args) {


        Aluno a1 = new Aluno("Wyslan");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("Jose");
        Aluno a4 = new Aluno("Pedro");

        // Não pode ter repetição
        Set<Aluno> alunos = new HashSet<>();
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a4);

        imprimirAlunos(alunos);
    }

    public static void imprimirAlunos(Set<Aluno> alunos){
        for(Aluno a : alunos){
            System.out.println("Nome: " + a.getNome());
        }
    }
}
