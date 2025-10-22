import java.util.Random;
import java.util.Scanner;

public class SorteadordeDados {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.print("Quantos dados deseja jogar?");
        int quantidade = entrada.nextInt();

        System.out.print( "\n Resultado do lançamento: ");
        for(int i = 1; i <= quantidade; i++){
            int resultado = aleatorio.nextInt(6) + 1;
            System.out.println("Dado " + i +  ": " + resultado);
        }
        entrada.close();
    }
}
