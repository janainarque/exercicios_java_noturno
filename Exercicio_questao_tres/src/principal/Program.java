package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Informe um n�mero inteiro: ");
		numero1 = leia.nextInt();
		
		System.out.println("Informe outro n�mero inteiro: ");
		numero2 = leia.nextInt();
		
	
		System.out.println();
		
		System.out.print("A soma dos dois n�meros �: " + (numero1 + numero2));
		
		leia.close();
	

	}

}
