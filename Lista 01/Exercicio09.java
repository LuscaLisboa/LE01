import java.util.Scanner;

public class Exercicio09 {
    public void function(){

        Scanner read = new Scanner(System.in);

        System.out.println("Informe o n° A: ");
        double A = read.nextDouble();

        System.out.println("Informe o n° B: ");
        double B = read.nextDouble();

        if(A == B) System.out.println("A é igual a B | " + A + " = " + B);
        if(A != B){
            System.out.println("A é diferente que B");
            if(A > B) System.out.println("A é maior que B | " + A + " > " + B);
            if(A < B) System.out.println("A é menor que B | " + A + " < " + B);
        }

        read.close();
    }
}
