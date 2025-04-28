import java.util.Scanner;
public class Questao20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b,c;


       do {
           System.out.println("Digite o primeiro valor: ");
           a=scn.nextInt();
           System.out.println("Digite o segundo valor: ");
           b=scn.nextInt();
           System.out.println("Digite o terceiro valor: ");
           c=scn.nextInt();

           if (a <= 0  || b <= 0 || c <= 0);
           System.out.println("Os valores são inválidos, por favor digite um número positivo.");

       }while (a <= 0  || b <= 0 || c <= 0);

       int menor = Math.min(a,Math.min(b,c));
       int maior = Math.max(a,Math.max(b,c));

       int multi = menor * maior;
       double div = (double) maior / menor;

        System.out.println("O resultado da multiplicação do menor com o maior foi de: "+multi);

        System.out.println("O resultado da divisão do menor com o maior foi de: "+div);



//        if(a<b && b<c){
//            a = a * c;
//            System.out.println("O resultado da multiplicação do menor com o maior foi de: "+a);
//            c = c / a;
//            System.out.println("O resultado da divisão do maior com o menor foi de: "+a);
//        } else if (a<c && c<b) {
//            a = a * b;
//            System.out.println("O resultado da multiplicação do menor com o maior foi de: "+a);
//            b = b / a;
//            System.out.println("O resultado da divisão do maior com o menor foi de: "+b);
//        } else if (b<a && a<c) {
//            b = b * c;
//            System.out.println("O resultado da multiplicação do menor com o maior foi de: "+b);
//            c = c / b;
//            System.out.println("O resultado da divisão do maior com o menor foi de: "+c);
//        } else if (b<c && c<a) {
//            b = b * a;
//            System.out.println("O resultado da multiplicação do menor com o maior foi de: "+b);
//            a = a / b;
//            System.out.println("O resultado da divisão do maior com o menor foi de: "+a);
//        } else if (c<a && a<b) {
//            c = c * b;
//            System.out.println("O resultado da multiplicação do menor com o maior foi de: "+c);
//            b = b / c;
//            System.out.println("O resultado da divisão do maior com o menor foi de: "+b);
//        } else if (c<b && b<a) {
//            c = c * a;
//            System.out.println("O resultado da multiplicação do menor com o maior foi de: "+c);
//            a = a / c;
//            System.out.println("O resultado da divisão do maior com o menor foi de: "+a);
        }

    }

