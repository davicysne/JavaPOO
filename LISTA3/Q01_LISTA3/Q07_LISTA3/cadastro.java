package LISTA3.Q01_LISTA3.Q07_LISTA3;

import java.util.ArrayList;
import java.util.List;

public class cadastro {
    private List<aluno>alunos;

    public cadastro() {
        alunos = new ArrayList<>();
    }

    public void addALunos(aluno aluno) {
        alunos.add(aluno);
    }

    public void imprimirAlunos() {
        for (aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
