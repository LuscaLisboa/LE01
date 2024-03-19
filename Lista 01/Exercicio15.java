import java.util.Scanner;

public class Exercicio15 {
    public void function(){

        Scanner read = new Scanner(System.in);

        double[] P1 = new double[2];
        double[] P2 = new double[2];

        System.out.println("Informe x1 de P1: ");
        P1[0] = read.nextDouble();
        System.out.println("Informe y1 de P1: ");
        P1[1] = read.nextDouble();

        System.out.println("Informe x2 de P2: ");
        P2[0] = read.nextDouble();
        System.out.println("Informe y2 de P2: ");
        P2[1] = read.nextDouble();

        System.out.println(Math.sqrt(Math.pow(P2[0] - P1[0], 2) + Math.pow(P2[1] - P1[1], 2)));

        read.close();
    }
}
