import br.com.digitalhouse.Estudioso;

import java.util.Objects;

public class Aluno implements Estudioso {

    private String nomeAluno;
    private String sobrenomeAluno;
    private int codigoAluno;

    public Aluno(String nomeAluno, String sobrenomeAluno, int codigoAluno){
        this.nomeAluno = nomeAluno;
        this.sobrenomeAluno = sobrenomeAluno;
        this.codigoAluno = codigoAluno;
    }

    @Override
    public boolean equals(Object aluno) {
        if (this == aluno) return true;
        if (aluno == null || getClass() != aluno.getClass()) return false;
        Aluno alunoComparado = (Aluno) aluno;
        return codigoAluno == alunoComparado.codigoAluno;
    }

    @Override //verificar se está certo
    public int hashCode() {
        return Objects.hash(codigoAluno);
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getSobrenomeAluno() {
        return sobrenomeAluno;
    }

    public void setSobrenomeAluno(String sobrenomeAluno) {
        this.sobrenomeAluno = sobrenomeAluno;
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    @Override
    public float getNivelDeEstudo() {
        return 0;
    }
}
