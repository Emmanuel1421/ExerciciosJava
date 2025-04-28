import java.util.Scanner;
public class Questao8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double raio,altura,volume;
        double pi = 3.14;

        System.out.println("Insira o valor do raio: ");
        raio = scn.nextDouble();

        System.out.println("Insira o valor da altura: ");
        altura = scn.nextDouble();

        volume = pi * raio * raio * altura;

        System.out.println("O volume da lata de óleo é: "+volume);

        /*Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
V = 3.14159 * R * R * A
Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura*/
    }
}
