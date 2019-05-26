import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    private String nomeCurso;
    private int codigoCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private int qtdMaximaAlunos;
    private List<Aluno> listaAlunos = new ArrayList<>();

    public void removerUmAluno(Aluno aluno){
        listaAlunos.remove(aluno);
        System.out.println("aluno removido");
    }

    public boolean adcionarUmAluno(Aluno aluno) {
        if (qtdMaximaAlunos > listaAlunos.size()) {
            listaAlunos.add(aluno);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean equals(Object curso) {
        if (this == curso) return true;
        if (curso == null || getClass() != curso.getClass()) return false;
        Curso cursoComparado = (Curso) curso;
        return codigoCurso == cursoComparado.codigoCurso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoCurso);
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public int getQtdMaximaAlunos() {
        return qtdMaximaAlunos;
    }

    public void setQtdMaximaAlunos(int qtdMaximaAlunos) {
        this.qtdMaximaAlunos = qtdMaximaAlunos;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }


}
