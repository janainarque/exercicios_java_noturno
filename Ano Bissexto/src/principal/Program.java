package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		int ano = leia.nextInt();
		
		if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println(ano + " � um ano bissexto");
		}
		else {
			System.out.println(ano + " n�o � um ano bissexto");
		}
				
		leia.close();
		
		

	}

}
