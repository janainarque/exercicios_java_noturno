package principal;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
        
        int[] numeros = new int[51];
        
        for (int i = 1; i < 51; i++) {
            System.out.print("Digite o número " + (i) + ": ");
            numeros[i] = sc.nextInt();
        	//numeros[i] = random.nextInt(50);
        }
        
        
        for (int i = 1; i < 51; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("Número par é o: " + numeros[i] + ", Posição: " + (i));
            }
        }
        
        sc.close();

	}

}
