import java.util.Scanner;

public class Questao24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a,b,opc;
        boolean continuar = true;

        while(continuar){
        System.out.println("--------------Verificador de números--------------");

        System.out.println("Menu de Opções:");

        System.out.println("1. Verificar se um dos números lidos é ou não múltiplo do outro.");

        System.out.println("2. Verificar se os dois números lidos são pares.");

        System.out.println("3. Verificar se a média dos dois números é maior ou igual a 7.");

        System.out.println("4. Sair");
        opc = scn.nextInt();

        System.out.println("\n----------------------- // -----------------------\n");

            switch (opc) {
                case 1: {
                    System.out.println("Digite o primeiro valor:");
                    a = scn.nextInt();

                    System.out.println("Digite o segundo valor:");
                    b = scn.nextInt();

                    if (a % b == 0)
                        System.out.println(a + " É múltiplo de " + b);
                    else if (b % a == 0)
                        System.out.println(b + " É múltiplo de " + a);
                    else
                        System.out.println("Nenhum é múltiplo do outro");
                    break;
                }
                case 2: {
                    System.out.println("Digite o primeiro valor:");
                    a = scn.nextInt();

                    System.out.println("Digite o segundo valor:");
                    b = scn.nextInt();

                    if (a % 2 == 0 && b % 2 == 0) {
                        System.out.println("Os dois valores são pares");
                    }
                    else if (a % 2 == 1 && b % 2 == 1) {
                        System.out.println("Os dois valores são ímpares");
                    }
                    else if (a % 2 == 0) {
                        System.out.println("O primeiro valor é par");
                    }
                    else if (a % 2 == 1) {
                        System.out.println("O primeiro valor é ímpar");
                    }
                    else if (b % 2 == 0) {
                        System.out.println("O segundo valor é par");
                    }
                    else if (b % 2 == 1) {
                        System.out.println("O segundo valor é ímpar");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Digite o primeiro valor:");
                    a = scn.nextInt();

                    System.out.println("Digite o segundo valor:");
                    b = scn.nextInt();

                    double media = (a + b) / 2.0;
                    if (media >= 7)
                        System.out.println("Excelente! A média é " + media);
                    else
                        System.out.println("Que pena! A média é " + media);
                    break;
                }
                case 4: {
                    System.out.println("Encerrando o programa...");
                    continuar = false;
                    break;
                }
                default:
                    System.out.println("Insira um valor válido!");
            }
        }

    }
}
