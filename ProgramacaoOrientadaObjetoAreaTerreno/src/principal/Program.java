package principal;

import java.util.Scanner;

import entities.AreaTerreno;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AreaTerreno areaTerreno = new AreaTerreno();
				
		System.out.println("Informe a largura: ");
		double largura = sc.nextDouble();
	
		System.out.println("Informe o comprimento: ");
		double comprimento = sc.nextDouble();
	
		
		
		areaTerreno.retornaArea(largura, comprimento);
		
		System.out.println("A area total é de: " + areaTerreno.areaCalculada + " metros");

		
		sc.close();
		

	}

}
