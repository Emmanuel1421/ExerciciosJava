import java.util.Scanner;
public class Questao14 {

        public static void main (String []args ) {
            Scanner scn = new Scanner(System.in);

            int a,b;
            System.out.println("Digite o primeiro valor:");
            a = scn.nextInt();

            System.out.println("Digite o segundo valor:");
            b = scn.nextInt();


            if (a > b ) {
                a = a-b;
                System.out.println("A diferença dos valores inseridos : "+a);
            } else if(a < b) {
                b = b - a;
                System.out.println("A diferença dos valores inseridos : "+b);
            } else {
                System.out.println("Os valores inseridos são iguais.");
            }

        }
    }

