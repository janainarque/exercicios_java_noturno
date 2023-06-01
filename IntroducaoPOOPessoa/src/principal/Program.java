package principal;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Nome: ");
		pessoa.nome = sc.nextLine();
		
		System.out.println("Ano de nascimento: ");
		int ano = sc.nextInt();
		//pessoa.retornaIdade(sc.nextInt()); pode ficar assim tbm ao inves da linha de cima, porem não é uma boa pratica
		
		System.out.println("Sexo: ");
		pessoa.sexo = sc.next().charAt(0);
		
		
		pessoa.retornaIdade(ano);
		
		System.out.println("Nome: " + pessoa.nome);
		System.out.println("Idade: " + pessoa.idade);
		System.out.println("Sexo: " + pessoa.sexo);
		
		/*
		pessoa.nome = "Janaina Arque";
		pessoa.idade = 29;
		pessoa.sexo = 'F'; 

		System.out.println("Nome: " + pessoa.nome + "; idade: " + pessoa.idade + " anos; sexo: " + pessoa.sexo);
		
		*/
		
		sc.close();

	}

}
