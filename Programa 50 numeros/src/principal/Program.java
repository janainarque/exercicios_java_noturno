package principal;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[50];
        
        for (int i = 1; i < 50; i++) {
            System.out.print("Digite o n�mero " + (i) + ": ");
            numeros[i] = sc.nextInt();
        }
        
        
        for (int i = 1; i < 50; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("N�mero par � o: " + numeros[i] + ", Posi��o: " + (i));
            }
        }
        
        sc.close();

	}

}
