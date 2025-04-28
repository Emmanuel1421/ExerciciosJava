import java.util.Scanner;

public class Questao25 {
    public static void main(String[] args) {
        double altura,pesoIdeal;
        char sexo;


        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o seu sexo: ");
        sexo = scn.next().charAt(0);

        System.out.println("Digite a sua altura: ");
        altura = scn.nextDouble();

        if (sexo == 'H') {
            pesoIdeal = (72.7*altura) - 58;
            System.out.println("Seu peso ideal é: "+pesoIdeal);
        }
        else if (sexo == 'M') {
            pesoIdeal = (62.1*altura) - 44.7;
            System.out.println("Seu peso ideal é: "+pesoIdeal);
        }


    }
}
