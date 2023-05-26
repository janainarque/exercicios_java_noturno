package principal;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[50];
        
        for (int i = 1; i < 50; i++) {
            System.out.print("Digite o número " + (i) + ": ");
            numeros[i] = sc.nextInt();
        }
        
        
        for (int i = 1; i < 50; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("Número par é o: " + numeros[i] + ", Posição: " + (i));
            }
        }
        
        sc.close();

	}

}
