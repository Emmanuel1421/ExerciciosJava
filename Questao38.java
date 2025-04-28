import java.util.Scanner;

public class Questao38 {
    public static void main(String[] args) {
        String C;
        int N,E;
        int salarioHora = 10;
        int salarioFinal;
        int salarioExcedente;

        boolean continuar = true;

        Scanner scn = new Scanner(System.in);

        while (continuar) {
            System.out.println("Digite o código do funcionário: ");
            C = scn.next();

            System.out.println("Digite a quantidade de horas de trabalho: ");
            N = scn.nextInt();

            if (N > 50){
                E = N - 50;
            }else
                E = 0;

            salarioExcedente = E * 20;
            salarioFinal = N * salarioHora + salarioExcedente;

            System.out.println("O salário final é de: "+salarioFinal);

            System.out.println("---------- // ----------");

            System.out.println("Deseja encerrar o programa?");
            String resposta = scn.next();

            if (resposta.equalsIgnoreCase("S")){
                System.out.println("Encerrando o programa...");
                continuar = false;
            }
        }
        scn.close();
    }
}
