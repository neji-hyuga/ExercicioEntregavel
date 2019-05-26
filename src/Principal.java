import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        DigitalHouseManager digital1 = new DigitalHouseManager();

        digital1.registrarProfessorTitular("Raul", "Gonzalez", 771, "Android");
        digital1.registrarProfessorTitular("George", "Weah", 661, "iOS");
        digital1.registrarProfessorAdjunto("Eric", "Cantona", 772, 7);
        digital1.registrarProfessorAdjunto("Nuno", "Gomes", 662, 9);

        digital1.registrarCurso("Android", 20001, 2);
        digital1.registrarCurso("Full Stack", 20002, 3);

        digital1.alocarProfessor(20001, 771, 772);
        digital1.alocarProfessor(20002, 661, 662);

        digital1.registrarAluno("Juan Sebastian", "Verón", 110);
        digital1.registrarAluno("Michael", "Owen", 111);
        digital1.registrarAluno("Patrick", "Kluivert", 112);
        digital1.registrarAluno("Romário", "Farias", 113);
        digital1.registrarAluno("Josep", "Guardiola", 114);

        digital1.matricularAluno(110, 20001);
        digital1.matricularAluno(111, 20001);
        digital1.matricularAluno(112, 20001);
        digital1.matricularAluno(113, 20002);
        digital1.matricularAluno(114, 20002);

        digital1.getCursoPorCodigo(110);

        /*Scanner teclado = new Scanner(System.in);
        System.out.println("###Consultar Matrícula###");
        System.out.println("Digite o código do aluno: ");
        int codigoAluno;
        codigoAluno = teclado.nextInt();
        try { // try sempre no erro mais superficial
        */Curso curso = digital1.getCursoPorCodigoDoAluno(113);
            System.out.println("Curso da matrícula: " + curso.getNomeCurso());/*
        } catch (NullPointerException e) {
            System.out.println("Aluno não cadastrado");
        }*/


    }
}