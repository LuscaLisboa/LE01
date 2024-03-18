import java.util.Scanner;

public class Exercicio02 {
    public void function(){

        Scanner read = new Scanner(System.in);

        System.out.println("Informe o 1° n°: ");
        double numA = read.nextDouble();

        System.out.println("Informe o 2° n°: ");
        double numB = read.nextDouble();

        System.out.println(numA + " + " + numB + " = " + (numA+numB));

        read.close();
    }
}
