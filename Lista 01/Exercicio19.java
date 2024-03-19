import java.util.Scanner;

public class Exercicio19 {
    public void function(){

        Scanner read = new Scanner(System.in);

        double[] cilindro = new double[2]; // 0 = raio | 1 = altura

        System.out.println("Informe o raio do cilindro: ");
        cilindro[0] = read.nextDouble();
        System.out.println("Informe a altura do cilindro: ");
        cilindro[1] = read.nextDouble();

        System.out.println("Raio: " + cilindro[0]);
        System.out.println("Altura: " + cilindro[1]);
        System.out.println("Volume: " + 3.14 * Math.pow(cilindro[0], 2) * cilindro[1]);

        read.close();
    }
}
