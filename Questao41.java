import java.util.Scanner;

public class Questao41 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String[] categorias = {"Infantil A","Infantil B","Juvenil A","Juvenil B","Adultos"};

        System.out.println("Digite a idade do nadador: ");
        int idade = scn.nextInt();

        if (idade >= 18)
            System.out.println("O(a) nadador(a) é da categoria: "+categorias[4]);
        else if (idade >= 14)
            System.out.println("O(a) nadador(a) é da categoria: "+categorias[3]);
        else if (idade >= 12)
            System.out.println("O(a) nadador(a) é da categoria: "+categorias[2]);
        else if (idade >= 8)
            System.out.println("O(a) nadador(a) é da categoria: "+categorias[1]);
        else if (idade >= 5)
            System.out.println("O(a) nadador(a) é da categoria: "+categorias[0]);
        else
            System.out.println("O(a) nadador(a) é jovem demais para ter uma categoria.");

        scn.close();
    }
}
