import java.util.Scanner;

public class Questao23 {
    public static int adicao(){
        Scanner scn = new Scanner(System.in);

        int num1,num2,resultado;
        System.out.println("Digite o primeiro numero:");
        num1 = scn.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = scn.nextInt();

        resultado = num1 + num2;
        System.out.println("O resultado da adição foi: "+resultado);

        scn.close();
        return resultado;
    }
    public static int subtracao(){
        Scanner scn = new Scanner(System.in);

        int num1,num2,resultado;
        System.out.println("Digite o primeiro numero:");
        num1 = scn.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = scn.nextInt();

        resultado = num1 - num2;
        System.out.println("O resultado da subtração foi: "+resultado);

        scn.close();
        return resultado;
    }
    public static int multiplicacao(){
        Scanner scn = new Scanner(System.in);

        int num1,num2,resultado;

        System.out.println("Digite o primeiro numero:");
        num1 = scn.nextInt();

        System.out.println("Digite o segundo numero:");
        num2 = scn.nextInt();

        resultado = num1 * num2;
        System.out.println("O resultado da multiplicação foi: "+resultado);

        scn.close();
        return resultado;
    }
    public static int divisao(){
        Scanner scn = new Scanner(System.in);

        int num1,num2,resultado;

        System.out.println("Digite o primeiro numero:");
        num1 = scn.nextInt();

        System.out.println("Digite o segundo numero:");
        num2 = scn.nextInt();

        resultado = num1 / num2;
        System.out.println("O resultado da divisão foi: "+resultado);

        scn.close();
        return resultado;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int opcao;

        System.out.println("--------------Calculadora--------------");

        System.out.println("1.Adição");
        System.out.println("2.Subtração");
        System.out.println("3.Multiplicação");
        System.out.println("4.Divisão");
        System.out.println("Selecione a opção desejada:");
        opcao = scn.nextInt();

        switch (opcao) {
            case 1:{
                adicao();
                break;
            }
            case 2:{
                subtracao();
                break;
            }
            case 3:{
                multiplicacao();
                break;
            }
            case 4:{
                divisao();
                break;
            }
            default:
                System.out.println("Insira um valor válido.");
        }


    }

}
