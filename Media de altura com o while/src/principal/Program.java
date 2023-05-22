package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		double somaAltura = 0;
		double altura = 0;
		int contador = 0;
		
		while(contador < 5) {
			System.out.println("Insira a altura: ");
			contador++;
			altura = sc.nextDouble();
			somaAltura += altura;
			System.out.println(contador);
		}
		System.out.println(contador);
		System.out.println("A media das alturas é de : " + (somaAltura / contador) );
		
		
		sc.close();
		
		
	}

}
