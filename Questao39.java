import java.util.Scanner;

public class Questao39 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean continuar = true;
        int num;

        while (continuar){
            System.out.println("Digite um número: ");
            num = scn.nextInt();

            if (num % 2 == 0)
                System.out.print("O número é par");
            else if (num % 2 == 1)
                System.out.print("O número é ímpar");
            else
                System.out.println("Zero é par");

            if (num > 0)
                System.out.println(" e é positivo");
            else if (num < 0)
                System.out.println(" e é negativo");
            else
                System.out.println(" e é neutro");

            System.out.println("----------- // -----------");

            System.out.println("Deseja encerrar o programa?");
            String resposta = scn.next();

            if (resposta.equalsIgnoreCase("S")) {
                System.out.println("Encerrando o programa...");
                continuar = false;
            }

        }


    }
}
