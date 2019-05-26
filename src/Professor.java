import java.util.Objects;

public abstract class Professor {
    private String nomeProfessor;
    private String sobrenomeProfessor;
    private int tempoDeCasa;
    private int codigoProfessor;

    @Override
    public boolean equals(Object professor) {
        if (this == professor) return true;
        if (professor == null || getClass() != professor.getClass()) return false;
        Professor professorComparado = (Professor) professor;
        return codigoProfessor == professorComparado.codigoProfessor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoProfessor);
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getSobrenomeProfessor() {
        return sobrenomeProfessor;
    }

    public void setSobrenomeProfessor(String sobrenomeProfessor) {
        this.sobrenomeProfessor = sobrenomeProfessor;
    }

    public int getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(int tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public int getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(int codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }
}
