package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Atividade laços de repetiçao - exercicio 1
		Scanner sc = new Scanner(System.in);
		
		double somaAltura = 0;
		double altura = 0;
		
		for(int contador = 1; contador <= 5; contador++) {
			System.out.println("Insira a altura: ");
			altura = sc.nextDouble();
			somaAltura += altura;
		}
		System.out.println("A media das alturas é de : " + (somaAltura / 5) );
		
		
		sc.close();
			
	}

}
