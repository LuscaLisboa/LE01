import java.util.Scanner;

public class Exercicio20 {
    public void function(){

        Scanner read = new Scanner(System.in);

        double time;
        double Vm;

        System.out.println("Informe o tempo em hora: ");
        time = read.nextDouble();
        System.out.println("Informe a velocidade média: ");
        Vm = read.nextDouble();

        System.out.println("Litros gastos: " + (Vm * time) / 12);

        read.close();
    }
}
