package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1 = 10;
		int numero2 = 10;
		boolean bool = false;
		
		
		if(numero1 >= numero2) {
			System.out.println("Número 1 é o maior");			
		}
		else {
			System.out.println("Número 2 é maior");
		}
		
		
		if(!bool == true) {
			System.out.println("Verdadeiro");
		}
		else {
			System.out.println("Falso");
		}
		
		
		/*
		 * Exemplo usando resto da divisão
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		System.out.println("Entre com um número para saber se é par ou impar");
		numero = leia.nextInt();
		
		if(numero % 2 == 0){ // % é a mesma coisa que resto da divisão
			System.out.println("Número par!");
		}
		else {
			System.out.println("Número impar!");
		}
		
				
		leia.close();
		

	}

}
