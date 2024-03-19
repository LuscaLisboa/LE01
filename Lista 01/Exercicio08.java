import java.util.Scanner;

public class Exercicio08 {
    public void function(){

        Scanner read = new Scanner(System.in);

        System.out.println("Informe um n°: ");
        double numA = read.nextDouble();

        if(numA >= 50) System.out.print(numA + " é maior ou igual que 50");
        if(numA < 50) System.out.print(numA + " é menor que 50");

        read.close();
    }
}
