import java.util.Scanner;

public class Questao37 {
    public static double adicao() {
        Scanner scn = new Scanner (System.in);
        double n1,n2,soma;

        System.out.println("Digite o primeiro valor: ");
        n1 = scn.nextInt();

        System.out.println("Digite o segundo valor: ");
        n2 = scn.nextInt();

        if(n1 <= 0){
            System.out.println("Digite um número maior que zero");
        }
        if(n2 <= 0){
            System.out.println("Digite um número maior que zero");
        }

        soma = n1+n2;

        System.out.println("O resultado da soma é: "+soma);

        System.out.println("---------- // ----------");

        return soma;
    }

    public static double subtracao() {
        Scanner scn = new Scanner(System.in);
        double n1,n2,sub;

        System.out.println("Digite o primeiro valor: ");
        n1 = scn.nextDouble();

        System.out.println("Digite o segundo valor: ");
        n2 = scn.nextDouble();

        if(n1 <= 0){
            System.out.println("Digite um número maior que zero");
        }
        if(n2 <= 0){
            System.out.println("Digite um número maior que zero");
        }

        sub = n1 - n2;

        System.out.println("O resultado da subtração é: "+sub);

        System.out.println("---------- // ----------");

        return sub;
    }
    public static double multiplacao() {
        Scanner scn = new Scanner (System.in);
        int n1,n2,multi;

        System.out.println("Digite o primeiro valor: ");
        n1 = scn.nextInt();

        System.out.println("Digite o segundo valor: ");
        n2 = scn.nextInt();

        if(n1 <= 0){
            System.out.println("Digite um número maior que zero");
        }
        if(n2 <= 0){
            System.out.println("Digite um número maior que zero");
        }

        multi = n1*n2;

        System.out.println("O resultado da multiplicação é: "+multi);

        System.out.println("---------- // ----------");

        return multi;
    }
    public static double divisao() {
        Scanner scn = new Scanner (System.in);
        int n1,n2,div;

        System.out.println("Digite o primeiro valor: ");
        n1 = scn.nextInt();

        System.out.println("Digite o segundo valor: ");
        n2 = scn.nextInt();

        try{
            div = n1/n2;
        } catch (ArithmeticException e){
            System.out.println("Você não pode dividir por zero");
            System.out.println(e.getMessage());
            return 0;
        }

        System.out.println("O resultado da soma é: "+div);

        System.out.println("---------- // ----------");

        return div;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("--------CALCULADORA--------");

        boolean continuar = true;
        do {
            System.out.println("Selecione uma operação");

            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("Digite 'S' para sair");
            String opc = scn.next();

            System.out.println("---------- // ----------");



            switch (opc.toUpperCase()){
                case ("1"):
                    adicao();
                    break;

                case ("2"):
                    subtracao();
                    break;

                case ("3"):
                    multiplacao();
                    break;

                case ("4"):
                    divisao();
                    break;

                case ("S"):
                    System.out.println("Encerrando o programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("A opção que você digitou é inválida.");
                    break;
            }
        }while(continuar);


    }
}
