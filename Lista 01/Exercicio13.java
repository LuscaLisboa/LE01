import java.util.Scanner;

public class Exercicio13 {
    public void function(){

        Scanner read = new Scanner(System.in);

        System.out.println("Informe o n° A: ");
        double A = read.nextDouble();

        System.out.println("Informe o n° B: ");
        double B = read.nextDouble();

        System.out.println("Informe o tipo do operador aritmético: ");
        System.out.println("Soma: [+]");
        System.out.println("Subtrção: [-]");
        System.out.println("Multiplicação: [*]");
        System.out.println("Divisão: [\\]");
        char operador = read.next().charAt(0); // ler char único

        switch (operador) {
            case '+':
                System.out.println(A + " + " + B + " = " + (A + B));
                break;
            case '-':
                System.out.println(A + " - " + B + " = " + (A - B));
                break;
            case '*':
                System.out.println(A + " * " + B + " = " + (A * B));
                break;
            case '\\':
                if(B != 0) System.out.println(A + " \\ " + B + " = " + (A / B));
                else{
                    System.out.println("Não é possível dividir por 0.");
                }
                break;
            default:
            System.out.println("Operador não definido.");
                break;
        }

        read.close();
    }
}
