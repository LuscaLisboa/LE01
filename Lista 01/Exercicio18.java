import java.util.Scanner;

public class Exercicio18 {
    public void function(){

        Scanner read = new Scanner(System.in);

        int qnt = 3;
        double[] nota = new double[qnt];
        double sum = 0;

        for(int i = 0; i < qnt; i++) {
            System.out.println("Informe a " + (i+1) + "° nota: ");
            nota[i] = read.nextDouble();
            sum += 1 / nota[i];
        }

        for(int i = 0; i < qnt; i++) {
            System.out.println((i+1) + "° nota: " + nota[i]);
        }

        System.out.println("Média harmônica: " + (qnt) / (sum));

        read.close();
    }
}
