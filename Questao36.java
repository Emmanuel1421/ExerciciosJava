import java.util.Scanner;

public class Questao36 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int numero = 0;
        int menor = 0;
        int maior = 0;
        int total = 0;
        int qtdNum = 1;

        System.out.println("Digite um número: ");
        numero = scn.nextInt();

        maior = numero;
        menor = numero;

        total = numero;

        for (int i = 0;i >= 0;i++){

            numero = scn.nextInt();

            if (numero < 0){
            break;}

            if (numero > maior)
                maior = numero;
            if (numero < menor)
                menor = numero;

            qtdNum++;
            total += numero;

        }
        System.out.println(total);
        System.out.println(qtdNum);
        double media = (double)total/qtdNum;

        System.out.println("O maior valor é: "+maior+"\n O menor valor é: "+menor+"\n A média é: "+media);

//        Faça um programa que leia 10 valores inteiros e positivos e:
//        - Encontre o maior valor
//        - Encontre o menor valor
//        - Calcule a média dos números lidos
    }
}
