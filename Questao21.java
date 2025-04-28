import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       int num;

        System.out.println("Insira 0 para encerrar o programa: ");

       do {
           System.out.println("Digite um numero: ");
           num = scn.nextInt();

           if (num > 0){
               System.out.println("O número é positivo.");
           }
           else  if (num < 0)
               System.out.println("O número é negativo.");


       } while (num != 0);
        System.out.println("O programa foi encerrado.");
    }
}
