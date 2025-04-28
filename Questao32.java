import java.util.Scanner;

public class Questao32 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num,i,qd,impar;
        int contador = 0;
        int somaQd = 0;

        System.out.println("Digite um valor maior que zero e menor que 10");
        num = scn.nextInt();

        if (num > 0 && num < 10) {
            qd = num*num;

            for (i = num; i < qd ;) {
                if (i % 2 == 1) {
                    i = i + 2;

                } if (i % 2 == 0) {
                    impar = i + 1;
                    i = impar + 2;

                }

                }
            while (contador < 20){
            somaQd+= i * i;
                System.out.println((contador + 1) + "* numero impar: " + i + " (quadrado =  " + (i * i ) + " )");
                i += 2;
                contador++;


            }System.out.println("A soma dos quadrados deu: "+somaQd);


        }



    }
}
