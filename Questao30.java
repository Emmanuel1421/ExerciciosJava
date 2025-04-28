import java.util.Scanner;

public class Questao30 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,i;
        num1=1;
        num2=2;
        num3=3;
        num4=4;
        num5=5;
        num6=6;
        num7=7;
        num8=8;
        num9=9;
        num10=10;


        for (i = 1; i <= 10; i++){
            int tabuada1 = num1 * i;
            int tabuada2 = num2 * i;
            int tabuada3 = num3 * i;
            int tabuada4 = num4 * i;
            int tabuada5 = num5 * i;
            int tabuada6 = num6 * i;
            int tabuada7 = num7 * i;
            int tabuada8 = num8 * i;
            int tabuada9 = num9 * i;
            int tabuada10 = num10 * i;

            System.out.println(num1 + " x " + i + " = " + tabuada1);

            System.out.println(num2 + " x " + i + " = " + tabuada2);

            System.out.println(num3 + " x " + i + " = " + tabuada3);

            System.out.println(num4 + " x " + i + " = " + tabuada4);

            System.out.println(num5 + " x " + i + " = " + tabuada5);

            System.out.println(num6 + " x " + i + " = " + tabuada6);

            System.out.println(num7 + " x " + i + " = " + tabuada7);

            System.out.println(num8 + " x " + i + " = " + tabuada8);

            System.out.println(num9 + " x " + i + " = " + tabuada9);

            System.out.println(num10 + " x " + i + " = " + tabuada10);

        }

    }
}
