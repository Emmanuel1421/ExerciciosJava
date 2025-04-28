import java.util.Scanner;

public class Questao40 {
    public static void main(String[] args) {
        double indice = 0;
        Scanner scn = new Scanner(System.in);
        boolean continuar = true;
        double industrias =0;

        while (continuar){
            indice = 0;

                System.out.println("Digite o índice de poluição: ");
                industrias = scn.nextDouble();
                indice += industrias;


            indice = indice / 3;

            System.out.println("O índice total é de: "+indice);

            if (indice >= 0.5){
                System.out.println("Todos os grupos devem ser notificados a paralisarem sua atividades.");
            } else if (indice >= 0.4) {
                System.out.println("As industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades.");
            } else if (indice >= 0.3) {
                System.out.println("As indústrias do 1º grupo são intimadas a suspenderem suas atividades.");
            } else
                System.out.println("O índice está aceitável, nenhuma empresa será notificada.");

            System.out.println("Deseja encerrar o programa? (S/N) ");
            String resposta = scn.next();

            if (resposta.equalsIgnoreCase("S")) {
                System.out.println("Encerrando o programa...");
                continuar = false;
            }
        }

        scn.close();

        /*A Secretaria de Meio Ambiente que controla o índice de poluição mantém 03 grupos de indústrias que são altamente
poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as
indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as industrias do
1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
notificados a paralisarem suas atividades. Faça um programa que leia o índice de poluição medido e emita a
notificação adequada aos diferentes grupos de empresas. O algoritmo só deve parar de rodar quando o usuário
responder "S" na seguinte pergunta, "Deseja encerrar o programa?". */
    }
}
