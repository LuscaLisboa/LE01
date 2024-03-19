import java.util.Scanner;

public class Exercicio11 {
    public void function(){

        Scanner read = new Scanner(System.in);

        int qnt = 3; // Coloque 10 e veja mágica ;)
        int[] numArray = new int[qnt];
        int temp;

        for(int i = 0; i < qnt; i++) {
            System.out.println("Informe o " + (i+1) + "° n°: ");
            numArray[i] = read.nextInt();
        }
        System.out.println("Array original: ");
        for(int i = 0; i < qnt; i++) {
            System.out.println(numArray[i]);
        }

        System.out.println("---------------------------------------------");

        for(int j = 0; j < qnt; j++){
            for(int i = 0; i < qnt - 1; i++) {
                if(numArray[i] > numArray[i+1]){
                    temp = numArray[i];
                    numArray[i] = numArray[i+1];
                    numArray[i+1] = temp;
                }
            }
        }
        System.out.println("Array novo: ");
        for(int i = 0; i < qnt; i++) {
            System.out.println(numArray[i]);
        }

        read.close();
    }
}
