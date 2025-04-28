import java.util.Scanner;
public class Questao17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero: ");
        num = scn.nextInt();

        if (num >= 0 && num <= 9){
            System.out.println("Valor válido");
        }else
            System.out.println("Valor invalido");
    }
}
