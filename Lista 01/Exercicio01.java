import java.util.Scanner;

public class Exercicio01 {
    public void function(){

        Scanner read = new Scanner(System.in);

        System.out.println("Informe um n°(decimais com \",\"): ");
        double numA = read.nextDouble();

        if(numA > 10) System.out.println("Número " + numA + " é maior que 10!");
        if(numA <= 10) System.out.println("Número "+ numA + " é menor ou igual a 10!");

        read.close();
    }
}
