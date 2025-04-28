import java.util.Scanner;

public class Questao3 {
/*Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua
comissão será de 5% do total da venda e que você tem os seguintes dados:
- Identificação do vendedor
- Código da peça
- Preço unitário da peça
- Quantidade vendida */

    public static void main(String[] args) {
        String cdVendedor;
        int cdPeca,qtdVendida;
        double valorPeca,resultadoVenda,comissao;

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o código do Vendedor: ");
        cdVendedor = scn.nextLine();

        System.out.println("Digite o código da Peça vendida: ");
        cdPeca = scn.nextInt();

        if (cdPeca == 1) {
            valorPeca = 5.00;
        } else if (cdPeca == 2) {
            valorPeca = 10.00;
        } else if (cdPeca == 3) {
            valorPeca = 20.00;
        } else {
            System.out.println("Código inválido");
            return;
        }

        System.out.println("Digite a quantidade das peças vendidas: ");
        qtdVendida = scn.nextInt();

        resultadoVenda= qtdVendida * valorPeca;
        comissao = resultadoVenda*((float)5/100);
        System.out.printf("O total da venda foi de: R$ %.2f%n e a comissão recebida foi de: R$ %.2f%n ",resultadoVenda,comissao);
    }
}
