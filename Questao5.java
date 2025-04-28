import java.util.Scanner;
public class Questao5 {

    public static void main(String[] args) {
        int kmL;
        double tempo,veloMed,distancia,ltGasto;

        Scanner scn = new Scanner (System.in);

        System.out.println("Digite a velocidade média do veículo durante a viagem: ");
        veloMed = scn.nextDouble();

        System.out.println("Digite o tempo(em horas) gasto na viagem: ");
        tempo = scn.nextDouble();

        distancia  = tempo * veloMed;

        System.out.println("A distância percorrida durante a viagem foi de: "+distancia+"KM");

        ltGasto = distancia / 12;

        System.out.println("A quantidade de gasolina utilizada foi de: "+ltGasto+"L");

        /*Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12
        Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média. Desta
        forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o
        valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula:
        LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média, tempo gasto,
        a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais*/
    }

}
