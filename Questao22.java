import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num,a,b;

        System.out.println("Digite um valor ");
        num = scn.nextInt();

        if (num > 0 ) {
            a = num;
            System.out.println("O valor inserido foi: "+a);
        } else if (num < 0) {
            b = num;
            System.out.println("O valor inserido foi: "+b);

        }


    }
}
