package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner(System.in);
		
		double grausCelsius;
		double fahrenheit;
		
		
		System.out.println("Informe a temperatura em graus Celsius: ");
		grausCelsius = leia.nextDouble();
		System.out.println();
		
		System.out.println(fahrenheit = ((grausCelsius * 1.8) + 32));
		System.out.println();
		
		
		leia.close();
		
		
		
	}

}
