
    import java.util.Scanner;

    public class Questao15 {
        public static void main(String[]args) {
            int n1,n2,n3,n4,rec;

            Scanner scn = new Scanner (System.in);

            System.out.println("Digite a primeira nota: ");
            n1 = scn.nextInt();

            System.out.println("Digite a segunda nota: ");
            n2 = scn.nextInt();

            System.out.println("Digite a terceira nota: ");
            n3 = scn.nextInt();

            System.out.println("Digite a quarta nota: ");
            n4 = scn.nextInt();

            double media = (n1 + n2 + n3 + n4) / 4.0;

            if (media >= 7 ){
                System.out.println("O aluno foi aprovado com a média de: "+media);}
            else if (media >= 4 && media < 7){
                System.out.println("O aluno está de recuperação, sua média foi de: "+media);

                System.out.println("Digite a nota que o aluno conseguiu na recuperação:");
                rec = scn.nextInt();

            double mediarec = (media + rec) / 2.0;

                if(mediarec >= 7){
                    System.out.println("O aluno passou! com a média de: "+mediarec);
                }else{
                    System.out.println("O aluno está reprovado! com a media de: "+mediarec);
                }
            }
            else
                System.out.println("O aluno está reprovado! com a media de: "+media);


        }
    }

