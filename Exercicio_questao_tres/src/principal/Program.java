package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Informe um número inteiro: ");
		numero1 = leia.nextInt();
		
		System.out.println("Informe outro número inteiro: ");
		numero2 = leia.nextInt();
		
	
		System.out.println();
		
		System.out.print("A soma dos dois números é: " + (numero1 + numero2));
		
		leia.close();
	

	}

}
