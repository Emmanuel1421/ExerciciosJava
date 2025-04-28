import java.util.Scanner;
public class Questao18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int codigo;

        System.out.println("Digite o valor do codigo: ");
        codigo =  scn.nextInt();

        if (codigo == 1 || codigo == 2 || codigo == 3 )
            System.out.println("Código válido");
        else
            System.out.println("Código invalido");

        switch (codigo)
            {
                case 1:
                    System.out.println("um");
                    break;
                case 2:
                    System.out.println("dois");
                    break;
                case 3:
                    System.out.println("três");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

    }
}
