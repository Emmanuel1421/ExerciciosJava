import java.util.Scanner;
public class Questao6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Double C;

        System.out.println("Digite a temperatura em graus Celsius: ");
        C = scn.nextDouble();

        Double F = (9 * C + 160)/5;

        System.out.println("A temperatura: "+ C +" convertida para Fahrenheit é: "+F);


        /*Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
        temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
        Fahrenheit e a variável C representa é a temperatura em graus Celsius.*/
    }

    }



