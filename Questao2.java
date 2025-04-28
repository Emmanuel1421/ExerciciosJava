import java.util.Scanner;

public class Questao2 {

    /*Faça um programa que:
    - Leia a cotação do dólar
    - Leia um valor em dólares
    - Converta esse valor para Real
    - Mostre o resultado*/

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double dolCotacao,real,dolDoUsuario;
         dolCotacao = 5.67;

        System.out.println("A cotação do dolar é de: "+dolCotacao);

        System.out.println("Digite o valor do Dolar:");
        dolDoUsuario = scn.nextDouble();


        real = dolDoUsuario * dolCotacao;

        System.out.println("Você tem $"+ dolDoUsuario +" dólares, o valor convertido para reais é de R$"+real);

    }

}
