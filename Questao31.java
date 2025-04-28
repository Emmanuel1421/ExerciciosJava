import java.util.Scanner;

public class Questao31 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int total = 0;
        int pares = 0;
        int impares = 0;

        for (int i = 1; i >= 0; i++) {
            System.out.println("Digite o número desejado:");
            int numero = scn.nextInt();

            if (numero % 2 == 0)
               pares += numero;

            if (numero % 2 == 1)
                impares += numero;

            if (numero < 0)
                break;
             total += numero;
            }

        System.out.printf("A soma de todos os números é: %d \n",total);

        System.out.printf("A soma dos números pares é: %d \n",pares);

        System.out.printf("A soma dos números ímpares é: %d",impares);

    }
}
