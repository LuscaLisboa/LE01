import java.util.Scanner;

public class Exercicio12 {
    public void function(){

        Scanner read = new Scanner(System.in);

        String[] months = {"Janeiro", "Fevereiro", "Março", "Abril",
                           "Maio", "Junho", "Julho", "Agosto",
                           "Setembro", "Outubro", "Novembro", "Dezembro"};

        System.out.println("Informe o n° do mês: ");
        int numA = read.nextInt();

        if(numA >= 1 && numA <= 12)System.out.println(months[numA-1]);
        else{
            System.out.println("Mês inválido.");
        }

        read.close();
    }
}
