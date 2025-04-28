import java.util.Scanner;
public class Questao19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int ladoA,ladoB,ladoC;

        System.out.println("Digite o valor do lado A:");
        ladoA = scn.nextInt();
        System.out.println("Digite o valor do lado B:");
        ladoB = scn.nextInt();
        System.out.println("Digite o valor do lado C:");
        ladoC = scn.nextInt();

        if (ladoA < ladoB+ladoC){
            if (ladoA==ladoB || ladoB==ladoC){
                System.out.println("O triângulo é equilátero");
            } else if (ladoB < ladoA+ladoC) {
                if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC ){
                    System.out.println("O triângulo é isósceles");
                }
                else
                    System.out.println("O triângulo é escaleno");
            }
            else
                System.out.println("Os lados fornecidos não formam um triângulo.");
        }


    }
}
