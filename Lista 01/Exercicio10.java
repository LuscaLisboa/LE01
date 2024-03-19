import java.util.Scanner;

public class Exercicio10 {
    public void function(){

        Scanner read = new Scanner(System.in);

        System.out.println("Informe o n° A: ");
        int numA = read.nextInt();

        switch (numA) {
            case 1:
                System.out.println("Um.");
                break;
            case 2:
                System.out.println("Dois.");
                break;
            case 3:
                System.out.println("Três.");
                break;
            case 4:
                System.out.println("Quatro.");
                break;
            case 5:
                System.out.println("Cinco.");
                break;
        
            default:
                System.out.println("Número inválido!");
                break;
        }

        read.close();
    }
}
