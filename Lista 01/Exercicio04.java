import java.util.Scanner;

public class Exercicio04 {
    public void function(){

        Scanner read = new Scanner(System.in);

        System.out.println("Informe o 1° n°: ");
        double numA = read.nextDouble();

        System.out.println("Informe o 2° n°: ");
        double numB = read.nextDouble();

        System.out.println("1°: " + numA + " | " + "2°: " + numB);
        System.out.println("Soma: " + (numA + numB));
        System.out.println("Subtração: " + (numA - numB));
        System.out.println("Multiplicação: " + (numA * numB));
        System.out.println("Divisão: " + (numA / numB));

        read.close();
    }
}
