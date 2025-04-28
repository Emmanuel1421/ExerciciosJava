import java.util.Scanner;

public class Questao34 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int maior = 0;
        int menor = 0;
        int numero = 0;

        System.out.println("Digite um número: ");
        numero = scn.nextInt();

        maior = numero;
        menor = numero;

        for (int i = 0;i >= 0;i++){

           numero = scn.nextInt();

            if (numero <= 0) {
                break;
            }


            if (numero > maior)
                maior = numero;
            if (numero < maior)
                menor = numero;
        }
        System.out.println("O maior número é: "+maior+"\n O menor é: "+menor);


//        Escreva um programa que leia um conjunto de números positivos e exiba o menor e o maior. Suporemos que o
//        número de elementos deste conjunto não é conhecido, e que um número negativo será utilizado para sinalizar o fim
//        dos dados
    }
}
