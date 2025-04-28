import java.util.Scanner;


public class Questao33 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    double media = 0;
    String nmMatricula;
    int qtdAlunos = 0;
    int aluno = 0;
    int nota = 0;
    int totalNotas = 0;

        for (int i = 1; i >= 0 ; i++){
            System.out.println("Digite o número da matrícula do aluno: ");
            nmMatricula = scn.next();
            System.out.println("Digite a nota da prova do aluno: ");
            nota = scn.nextInt();

            System.out.println("---------------- // ----------------");

            if (nota < 0)
                break;

            qtdAlunos ++;
            totalNotas += nota;

        }
        System.out.println(totalNotas);
        System.out.println(qtdAlunos);
        media = (double)totalNotas / qtdAlunos;
        System.out.println("A média da sala é: "+media);


//        Escreva um programa que calcule e exiba a média da nota dos alunos de uma turma em uma prova. O número de
//        alunos é desconhecido. Os dados de um aluno são: número de matrícula e a sua nota na prova em questão.
    }
}
