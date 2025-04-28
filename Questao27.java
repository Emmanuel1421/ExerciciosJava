import java.util.Scanner;

public class Questao27 {
    public static int fatorial(int num) {

            int fatorial = 1;
            for (int i = num; i > 1; i--) {
                fatorial *= i;
            }

        return fatorial;
    }
    public static void main(String[] args) {
        int qtdNum;
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que serão processados");
        qtdNum = scn.nextInt();

        do {

            System.out.println("Digite o número:");
            int num = scn.nextInt();

            int fatorial = fatorial(num);

            System.out.println("O fatorial de "+ num + "! é:" + fatorial);
            qtdNum--;

        }while(qtdNum > 0);


    }
}
