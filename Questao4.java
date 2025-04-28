import java.util.Scanner;

public class Questao4 {
    /*Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os valores
    lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis A, B, C e
    D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B com D e por
    último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo, devem ser
    realizadas doze operações de processamento, sendo seis para as adições e seis para as multiplicações*/

    public static void main(String[] args) {
        int a,b,c,d;
        int soma1,soma2,soma3,soma4,soma5,soma6,multi1,multi2,multi3,multi4,multi5,multi6;

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        a = scn.nextInt();
        System.out.println("Digite o segundo valor:");
        b = scn.nextInt();
        System.out.println("Digite o terceiro valor:");
        c = scn.nextInt();
        System.out.println("Digite o quarto valor:");
        d = scn.nextInt();

        soma1=a+b;
        soma2=a+c;
        soma3=a+d;
        soma4=b+c;
        soma5=b+d;
        soma6=c+d;

        multi1=(soma2 * a)+( soma1 * b);
        multi2=(soma3 * a)+( soma2 * c);
        multi3=(soma4 * a)+( soma3 * d);
        multi4=(soma5 * b)+( soma4 * c);
        multi5=(soma6 * b)+( soma5 * d);
        multi6=(soma6 * c)+( soma6 * d);

        System.out.println("O resultado da adição de A + B é: "+soma1+"; O produto da multiplicação de A * B é: "+multi1);
        System.out.println("O resultado da adição de A + C é: "+soma2+"; O produto da multiplicação de A * C é: "+multi2);
        System.out.println("O resultado da adição de A + D é: "+soma3+"; O produto da multiplicação de A * D é: "+multi3);
        System.out.println("O resultado da adição de B + C é: "+soma4+"; O produto da multiplicação de B * C é: "+multi4);
        System.out.println("O resultado da adição de B + D é: "+soma5+"; O produto da multiplicação de B * D é: "+multi5);
        System.out.println("O resultado da adição de C + D é: "+soma6+"; O produto da multiplicação de C * D é: "+multi6);
    }

}
