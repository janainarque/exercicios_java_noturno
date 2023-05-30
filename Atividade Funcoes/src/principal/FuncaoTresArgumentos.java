package principal;

import java.util.Scanner;

public class FuncaoTresArgumentos {


	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Informe o Primeiro número: ");
		double numero1 = Double.parseDouble(sc.nextLine());
		
		System.out.print("Informe o Segundo número: ");
		double numero2 = Double.parseDouble(sc.nextLine());
		
		System.out.print("Informe o Terceiro número: ");
		double numero3 = Double.parseDouble(sc.nextLine());
		
		System.out.println();
		System.out.println(somaNumeros(numero1, numero2, numero3));
		
		sc.close();
		
	}

	public static String somaNumeros(double numero1, double numero2, double numero3) {
		return "A soma dos desses três argumentos foi: " + (numero1 + numero2 + numero3); 			
	}
		
		

}
