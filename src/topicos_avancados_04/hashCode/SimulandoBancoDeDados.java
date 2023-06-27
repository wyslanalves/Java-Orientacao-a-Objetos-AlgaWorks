package topicos_avancados_04.hashCode;

import java.util.HashSet;
import java.util.Set;

public class SimulandoBancoDeDados {


        public static Set<Aluno> buscarAlunos() {
            Set<Aluno> alunos = new HashSet<>();
            alunos.add(new Aluno("Ricardo"));
            alunos.add(new Aluno("Thiago"));
            alunos.add(new Aluno("Maria"));
            alunos.add(new Aluno("Pedro"));

            return alunos;

    }
}
