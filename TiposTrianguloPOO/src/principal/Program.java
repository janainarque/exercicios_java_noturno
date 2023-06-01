package principal;

import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Triangulo triangulo = new Triangulo();
		
		
		System.out.println("Informe um lado do triangulo: ");
		double lado1 = sc.nextDouble();
		
		System.out.println("Informe outro lado triangulo: ");
		double lado2 = sc.nextDouble();
		
		System.out.println("Informe outro lado triangulo: ");
		double lado3 = sc.nextDouble();
		
		
		triangulo.retornaTipoTriangulo(lado1, lado2, lado3);

		 
		sc.close();

	}

}
