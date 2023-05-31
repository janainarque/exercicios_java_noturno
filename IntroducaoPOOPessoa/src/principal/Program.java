package principal;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.nome = "Janaina Arque";
		pessoa.idade = 29;
		pessoa.sexo = "feminino";

		System.out.println("Nome: " + pessoa.nome + "; idade: " + pessoa.idade + " anos; sexo: " + pessoa.sexo);

	}

}
