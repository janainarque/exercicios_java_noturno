package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		
		System.out.println("Informe a primeira nota bimestral: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Informe a segunda nota bimestral: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Informe a terceira nota bimestral: ");
		nota3 = leia.nextDouble();
		
		System.out.println("Informe a quarta nota bimestral: ");
		nota4 = leia.nextDouble();
		System.out.println();
		
		
		System.out.println("A média dessas notas foi: " + ((nota1 + nota2 + nota3 + nota4)/4));
		
		
		
		leia.close();

	}

}
