package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		
		int ano_nascimento;
		int ano_atual; 
		
		System.out.println("Qual o seu ano de nascimento? ");
		ano_nascimento = leia.nextInt(); //números inteiros
		leia.nextLine();
		
		
		System.out.print("Informe o ano atual: ");
	    ano_atual = leia.nextInt();
	    leia.nextLine();
	    
	    
	    System.out.println("VocÊ tem " + (ano_atual - ano_nascimento) + " anos" );
		
		
		leia.close();
		

	}

}
