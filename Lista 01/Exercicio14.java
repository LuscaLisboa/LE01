import java.util.Scanner;

public class Exercicio14 {
    public void function(){

        Scanner read = new Scanner(System.in);

        System.out.println("Informe o valor de a(1): ");
        double a1 = read.nextDouble();

        System.out.println("Informe o valor do termo(index): ");
        int n = read.nextInt();

        System.out.println("Informe a razão da PA: ");
        double r = read.nextDouble();

        System.out.println("a1: " + a1 + " | n: " + n + " | r: " + r);
        System.out.println("Resultado: a(" + n + ") = " + (a1 + (n - 1) * r));

        read.close();
    }
}
