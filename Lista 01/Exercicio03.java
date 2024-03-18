import java.util.Scanner;

public class Exercicio03 {
    public void function(){

        Scanner read = new Scanner(System.in);

        System.out.println("Informe o 1° n° inteiro: ");
        int A = read.nextInt();

        System.out.println("Informe o 2° n° inteiro: ");
        int B = read.nextInt();

        if(A > B) System.out.println(A + " é maior que " + B + ".");
        if(B > A) System.out.println(B + " é maior que " + A + ".");
        if(A == B) System.out.println("Sequência de números informados é inválida.");

        read.close();
    }
}
