import java.util.Scanner;

public class Exercicio06 {
    public void function(){

        Scanner read = new Scanner(System.in);

        System.out.println("Informe a temperatura em C°: ");
        double temp = read.nextDouble();

        System.out.println(temp + "C° -> " + ((9 * temp + 160) / 5) + "°F");

        read.close();
    }
}
