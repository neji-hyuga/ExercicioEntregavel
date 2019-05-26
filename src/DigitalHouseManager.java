import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> listaDeAlunos = new ArrayList<>();
    private List<Professor> listaDeProfessores = new ArrayList<>();
    private List<Curso> listaDeCursos = new ArrayList<>();
    private List<Matricula> listaDeMatriculas = new ArrayList<>();


    public void registrarCurso(String nomeCurso, Integer codigoCurso, Integer qtdMaximaAlunos){
        Curso curso = new Curso();
        curso.setNomeCurso(nomeCurso);
        curso.setCodigoCurso(codigoCurso);
        curso.setQtdMaximaAlunos(qtdMaximaAlunos);
        listaDeCursos.add(curso);
        System.out.println("O curso " + curso.getNomeCurso() + " foi registrado");
    }

    public void excluirCurso(Integer codigoCurso){
        listaDeCursos.remove(listaDeCursos.get(codigoCurso));
        System.out.println("curso excluído!");
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer qtdHoras){
        ProfessorAdjunto adjunto1 = new ProfessorAdjunto();
        adjunto1.setNomeProfessor(nome);
        adjunto1.setSobrenomeProfessor(sobrenome);
        adjunto1.setCodigoProfessor(codigoProfessor);
        adjunto1.setQtdHorasMonitoria(qtdHoras);
        listaDeProfessores.add(adjunto1);
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){
        ProfessorTitular titular = new ProfessorTitular();
        titular.setNomeProfessor(nome);
        titular.setSobrenomeProfessor(sobrenome);
        titular.setCodigoProfessor(codigoProfessor);
        titular.setEspecialidade(especialidade);
        listaDeProfessores.add(titular);
        System.out.println("O Professor " + titular.getNomeProfessor() + " " + titular.getSobrenomeProfessor() +
                             " registrado");
    }

    public void excluirProfessor(Integer codigoProfessor){
        listaDeProfessores.remove(codigoProfessor);
    }


    public void registrarAluno(String nome, String sobrenome, Integer codigo){
        Aluno aluno1 = new Aluno(nome, sobrenome, codigo);
        listaDeAlunos.add(aluno1);
        System.out.println("O aluno " + aluno1.getNomeAluno() + " foi registrado com sucesso");
    }

    public Aluno getAlunoPorCodigo(Integer codigo){

        for (Aluno aluno : listaDeAlunos) {
            if (aluno.getCodigoAluno() == codigo){
                return aluno;
            }
        }
        return null;
    }

    public Curso getCursoPorCodigo(Integer codigo) {
        for (Curso curso : listaDeCursos) {
            if (curso.getCodigoCurso() == codigo) {
                return curso;
            }
        }
        return null;
    }

    public Curso getCursoPorCodigoDoAluno(Integer codigoAluno){

        for (Matricula matricula : listaDeMatriculas) {
            if (matricula.getAluno().getCodigoAluno() == codigoAluno){
                return matricula.getCurso();
            }
        }

        return null;
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){
        Aluno aluno1 = getAlunoPorCodigo(codigoAluno);
        Curso curso1 = getCursoPorCodigo(codigoCurso);

        if (curso1.adcionarUmAluno(aluno1)){

            Matricula matricula1 = new Matricula(aluno1, curso1);
            listaDeMatriculas.add(matricula1);
            System.out.println("matrícula de " + aluno1.getNomeAluno() + " foi realizada no curso " + curso1.getNomeCurso());


        } else{
            System.out.println("matricula não realizada, turma completa");
        }
    }

    public Professor getProfessorPorCodigo(Integer codigo){
        for (Professor professor : listaDeProfessores) {
            if (professor.getCodigoProfessor()==codigo){
                return professor;
        }
    }
        return null; // pra não parar o for antes de acabar
    }

    public void alocarProfessor(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){
        ProfessorAdjunto adjunto1 = (ProfessorAdjunto) getProfessorPorCodigo(codigoProfessorAdjunto);
        ProfessorTitular titular1 = (ProfessorTitular) getProfessorPorCodigo(codigoProfessorTitular);
        Curso curso1 = getCursoPorCodigo(codigoCurso);
        curso1.setProfessorAdjunto(adjunto1);
        curso1.setProfessorTitular(titular1);
        System.out.println("Os professores " + adjunto1.getNomeProfessor() + " e " + titular1.getNomeProfessor() +
                           " foram alocados ao curso " + curso1.getNomeCurso());
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public List<Professor> getListaDeProfessores() {
        return listaDeProfessores;
    }

    public void setListaDeProfessores(List<Professor> listaDeProfessores) {
        this.listaDeProfessores = listaDeProfessores;
    }

    public List<Curso> getListaDeCursos() {
        return listaDeCursos;
    }

    public void setListaDeCursos(List<Curso> listaDeCursos) {
        this.listaDeCursos = listaDeCursos;
    }

    public List<Matricula> getListaDeMatriculas() {
        return listaDeMatriculas;
    }

    public void setListaDeMatriculas(List<Matricula> listaDeMatriculas) {
        this.listaDeMatriculas = listaDeMatriculas;
    }
}
