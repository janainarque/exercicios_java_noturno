package principal;

import java.util.Scanner;

public class FuncaoTresArgumentos {

/* 
 * meu codigo 
 * 
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
	
*/
	
	
	//C�digo Professor
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Entre com os 3 n�meros a serem somados");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		somarNumeros(n1, n2, n3);
		
		
		sc.close();
		
	}

	static void somarNumeros(int n1, int n2, int n3) {
		System.out.println("A soma dos numeros �: ");
		System.out.println(n1 + n2 + n3);
	}
		
		

}
