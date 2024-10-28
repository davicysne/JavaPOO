package LISTA3.Q01_LISTA3.Q07_LISTA3;

public class aluno {
    private int matricula;
    private String nome;
    private double ira;
    private String curso;

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", ira=" + ira +
                ", curso='" + curso + '\'' +
                '}';
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIra() {
        return ira;
    }

    public void setIra(double ira) {
        this.ira = ira;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public aluno(int matricula, String nome, double ira, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.ira = ira;
        this.curso = curso;
    }
}
