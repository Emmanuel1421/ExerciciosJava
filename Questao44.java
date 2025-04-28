import java.util.Scanner;

public class Questao44 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        boolean continuar = true;

        System.out.println("-----------------------------");

        System.out.println("MENU DE OPERAÇÕES\n");


        System.out.println("\n1.Conversão de Graus Celsius em Graus Fahrenheit");
        System.out.println("2.Conversão de Graus Fahrenheit em Graus Celsius");
        System.out.println("3.Peso ideal do homem");
        System.out.println("4.Peso ideal da mulher");

        System.out.println("------------ // ------------");

        System.out.println("\nDigite a opção desejada:");
        String opcao = scn.nextLine();

            do {
                System.out.println("\n1.Conversão de Graus Celsius em Graus Fahrenheit");
                System.out.println("2.Conversão de Graus Fahrenheit em Graus Celsius");
                System.out.println("3.Peso ideal do homem");
                System.out.println("4.Peso ideal da mulher");

                System.out.println("------------ // ------------");

                System.out.println("\nDigite a opção desejada:");
            switch (opcao) {

                case ("1"): {
                    Double C;

                    System.out.println("Digite a temperatura em graus Celsius: ");
                    C = scn.nextDouble();

                    Double F = (9 * C + 160) / 5;

                    System.out.println("A temperatura: " + C + " convertida para Fahrenheit é: " + F);
                    break;
                }
                case ("2"): {
                    double fahrenheit, celsius;

                    System.out.println("Digite a temperatura em graus Fahrenheit: ");
                    fahrenheit = scn.nextDouble();

                    celsius = (fahrenheit - 32) * 5 / 9;

                    System.out.println("A temperatura em graus celsius é de: " + celsius);
                    break;
                }
                case ("3"): {
                    double h, pesoIdeal;

                    System.out.println("Digite a sua altura: ");
                    h = scn.nextDouble();

                    pesoIdeal = (72.7 * h) - 58;

                    System.out.println("O seu peso ideal é de: " + pesoIdeal);
                    break;
                }
                case ("4"): {
                    double h, pesoIdeal;

                    System.out.println("Digite a sua altura: ");
                    h = scn.nextDouble();

                    pesoIdeal = (62.1 * h) - 44.7;

                    System.out.println("O seu peso ideal é de: " + pesoIdeal);
                    break;
                }
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println("Deseja encerrar o programa?(S/N)");
            String resposta = scn.next();

            if (resposta.equalsIgnoreCase("S")){
                System.out.println("Encerrando o programa...");
                continuar = false;

            }
        }  while (continuar == true);

    }
}
