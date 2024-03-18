import java.util.Scanner;

public class Exercicio05 {
    public void function(){

        Scanner read = new Scanner(System.in);

        System.out.println("Informe o n° A: ");
        double A = read.nextDouble();

        double inter;

        System.out.println("Informe o n° B: ");
        double B = read.nextDouble();

        System.out.println("A: " + A + " | " + "B: " + B + ".");

        inter = A;
        A = B;
        B = inter;

        System.out.println("A: " + A + " | " + "B: " + B + ".");

        read.close();
    }
}
