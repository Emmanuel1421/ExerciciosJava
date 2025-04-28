import java.util.Scanner;

public class Questao42 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int maior;
        int menor;

        System.out.println("Digite um número: ");
        int num = scn.nextInt();

        maior = num;
        menor = num;

        do {
            System.out.println("Digite outro número('0' para encerrar): ");
            num = scn.nextInt();

            if (num == 0)
                break;

            if (num > maior)
                maior = num;
            if (num < menor)
                menor = num;

        }while(true);

        System.out.println("O maior número é: "+maior+".\nO menor número é: "+menor);


        /*Faça um programa que determine o maior e o menor entre N números lidos. A condição de parada é a entrada de
um valor 0, ou seja, o programa deve ficar executando até que a entrada seja igual a 0 (ZERO)*/
    }
}
