import java.util.Scanner;
public class Questao16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b;

        System.out.println("Digite o primeiro numero: ");
        a=scn.nextInt();
        System.out.println("Digite o segundo numero: ");
        b=scn.nextInt();

        if (a>b){
            System.out.println("O maior número é "+a);
        } else if (a<b) {
            System.out.println("O maior número é "+b);
        } else
            System.out.println("Os numeros são iguais");


    }
}
