import java.util.Date;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private Date data;

    public Matricula (Aluno aluno, Curso curso){
        this.aluno = aluno;
        this.curso = curso;
        this.data = new Date();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
