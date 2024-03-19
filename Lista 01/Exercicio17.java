import java.util.Scanner;

public class Exercicio17 {
    public void function(){

        Scanner read = new Scanner(System.in);

        int qnt = 3;
        double[][] nota = new double[qnt][qnt];

        for(int i = 0; i < qnt; i++) {
            System.out.println("Informe a " + (i+1) + "° nota: ");
            nota[i][0] = read.nextDouble();
            System.out.println("Informe o " + (i+1) + "° peso: ");
            nota[i][1] = read.nextDouble();
        }
        for(int i = 0; i < qnt; i++) {
            System.out.println((i+1) + "° Nota: " + nota[i][0] + " | Peso: " + nota[i][1]);
        }
        System.out.println("Média ponderada: " + (nota[0][0] * nota[0][1] + nota[1][0] * nota[1][1] + nota[2][0] * nota[2][1]) / (nota[0][1] + nota[1][1] + nota[2][1]));

        read.close();
    }
}
