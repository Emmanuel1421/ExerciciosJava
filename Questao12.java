import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x;

        System.out.println("Insira um valor");
        x = scn.nextInt();

        if(x >= 0)
            System.out.println("O módulo de x é: "+x);
            else if (x < 0)
            System.out.println("O módulo de x é: "+x*(-1));

        //Escreva um programa que leia um número inteiro e exiba o seu módulo. O módulo de um número x é: x se x é maior
        //ou igual a zero
        //x * (-1) se x é menor que zero

    }
}
