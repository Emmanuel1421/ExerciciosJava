import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            int qtdMin,qtdMax;
            double qtdMed;

        System.out.println("Digite a quantidade mínima de peças: ");
        qtdMin = scn.nextInt();

        System.out.println("Digite a quantidade máxima de peças: ");
        qtdMax = scn.nextInt();

        qtdMed = (qtdMin + qtdMax) / 2.0;

        System.out.println("A quantidade média de peças é: "+qtdMed);

    }
}
