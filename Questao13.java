import java.util.Scanner;
public class Questao13 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num1,num2,num3,aux;

        System.out.println("Digite o primeiro valor: ");
        num1 = scn.nextInt();
        System.out.println("Digite o segundo valor: ");
        num2 = scn.nextInt();
        System.out.println("Digite o terceiro valor");
        num3 = scn.nextInt();


    if (num1 > num2 && num2 > num3)
        System.out.println(num1+"\n"+num2+"\n"+num3);
    else if (num1 > num3 && num3 > num2)
        System.out.println(num1+"\n"+num3+"\n"+num2);
    else if (num2 > num1 && num1 > num3)
        System.out.println(num2+"\n"+num1+"\n"+num3);
    else if (num2 > num3 && num3 > num1)
        System.out.println(num2+"\n"+num3+"\n"+num1);
    else if(num3 > num1 && num1 > num2)
        System.out.println(num3+"\n"+num1+"\n"+num2);
    else if(num3 >num2 && num2 > num1)
        System.out.println(num3+"\n"+num2+"\n"+num1);

    }
}
