package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		//String opcao = "Sexta-feira";
		int opcao = random.nextInt(8) + 1;
		
		System.out.println(opcao);
		
		switch (opcao) {
		case 1:
			System.out.println("Domingo");	
			break;
		case 2:
			System.out.println("Segunda");	
			break;
		case 3:
			System.out.println("Ter�a");	
			break;
		case 4:
			System.out.println("Quarta");	
			break;
		case 5:
			System.out.println("Quinta");	
			break;
		case 6:
			System.out.println("Sexta");	
			break;
		case 7:
			System.out.println("S�bado");	
			break;

		default:
			break;
		}
		
		
		
		/*
		switch (opcao) {
		case "Quarta-feira":
			System.out.println("O dia selecionado � quarta-feira");	
			break;
		case "Quinta-feira":
			System.out.println("O dia selecionado � quinta-feira");	
			break;
		case "Sexta-feira":
			System.out.println("O dia selecionado � sexta-feira");	
			break;

		default:
			System.out.println("N�o corresponde a um dia da semana");
			break;
		} */
		
		/*
		if(opcao == "Sexta-feira") {
			System.out.println("O dia selecionado � sexta-feira");	
		}
		else {
			System.out.println("N�o corresponde a um dia da semana");
		}
		
		*/
		

	}

}
