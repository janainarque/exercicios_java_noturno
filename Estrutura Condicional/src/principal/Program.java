package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1 = 10;
		int numero2 = 10;
		boolean bool = false;
		
		
		if(numero1 >= numero2) {
			System.out.println("N�mero 1 � o maior");			
		}
		else {
			System.out.println("N�mero 2 � maior");
		}
		
		
		if(!bool == true) {
			System.out.println("Verdadeiro");
		}
		else {
			System.out.println("Falso");
		}
		
		
		/*
		 * Exemplo usando resto da divis�o
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		System.out.println("Entre com um n�mero para saber se � par ou impar");
		numero = leia.nextInt();
		
		if(numero % 2 == 0){ // % � a mesma coisa que resto da divis�o
			System.out.println("N�mero par!");
		}
		else {
			System.out.println("N�mero impar!");
		}
		
				
		leia.close();
		

	}

}
