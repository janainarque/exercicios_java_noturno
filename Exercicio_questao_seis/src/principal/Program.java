package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		
		
		double grausFahrenheit;
		double celsius;
		
		System.out.println("Infome a temperatura em graus Fahrenheit: ");
		grausFahrenheit = leia.nextDouble();
		System.out.println();
		
		System.out.println("A temperatura transformada para graus Celsius � de "  + (celsius = 5 * ((grausFahrenheit - 32)/9)) + " graus");
		
		leia.close();
				
	}

}
