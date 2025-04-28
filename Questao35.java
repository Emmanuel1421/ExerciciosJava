public class Questao35 {
    public static void main(String[] args) {
        int numero = 0;
        for (int i = 0;i < 100;i++){

            numero++;

            System.out.println(numero);

            if (numero % 10 == 0){
                System.out.println("Múltiplo de 10");
            }
        }


        //Faça um programa que conte de 1 até 100 e a cada múltiplo de 10 exiba uma mensagem: "Múltiplo de 10"
    }
}
