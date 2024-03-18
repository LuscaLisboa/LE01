import java.util.Scanner;

public class Exercicio07 {
    public void function(){

        Scanner read = new Scanner(System.in);

        System.out.println("Informe um n°: ");
        double numA = read.nextDouble();

        if(numA >= 100 && numA <= 200) System.out.println(numA + " está entre 100 e 200.");
        if(numA < 100 || numA > 200) System.out.println(numA + " está fora do intervalo entre 100 e 200.");

        read.close();
    }
}
