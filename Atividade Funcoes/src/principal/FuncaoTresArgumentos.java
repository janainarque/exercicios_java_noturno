package principal;

import java.util.Scanner;

public class FuncaoTresArgumentos {


	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Informe o Primeiro n�mero: ");
		double numero1 = Double.parseDouble(sc.nextLine());
		
		System.out.print("Informe o Segundo n�mero: ");
		double numero2 = Double.parseDouble(sc.nextLine());
		
		System.out.print("Informe o Terceiro n�mero: ");
		double numero3 = Double.parseDouble(sc.nextLine());
		
		System.out.println();
		System.out.println(somaNumeros(numero1, numero2, numero3));
		
		sc.close();
		
	}

	public static String somaNumeros(double numero1, double numero2, double numero3) {
		return "A soma dos desses tr�s argumentos foi: " + (numero1 + numero2 + numero3); 			
	}
		
		

}
