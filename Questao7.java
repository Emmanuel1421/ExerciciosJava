import java.util.Scanner;
public class Questao7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        double fahrenheit,celsius;

        System.out.println("Digite a temperatura em graus Fahrenheit: ");
        fahrenheit = scn.nextDouble();

        celsius = (fahrenheit - 32) *5 / 9;

        System.out.println("A temperatura em graus celsius é de: "+celsius);

        /*Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a
variável C é a temperatura em graus Celsius. */
    }
}
