package principal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 variaveis s�o espa�os alocados na mem�ria que salvam uma informa��o (um dado)
		 variavel sempre come�a com letra minuscula
		 
		 tem o tipo int armazena n�meros inteiros, ent�o int s�o n�meros: 1,2,3,10,150...
		 tem o tipo double que s�o n�meros com casas decimais. exemplo: 10.50, 25.99 ...
		 tem o tipo char, � que o tipo que armazena um caractere � um tipo "literal" e a sua inicializa��o � feita com aspas simples. Exemplos de char: c, d, a, 1, 2 ...
		 tem o tipo String � uma classe de java utilizada para armazenar cadeias de caracteres (frases por exemplo). Sua inicializa��o � feita com aspas duplas.Exemplos de String: nome, locais...
		 */
		
		
		//primeiro vem o tipo(int) depois o nome(numero) depois � a atribui��o(=) e recebe o dado 
		int numero = 10;
		double precoDaCamisa = 20.50;
		String nome = "Janaina Arque";
		char sexo = 'F';
		
		int num1 = 5;
		int num2 = 10;
		int resultado = num1 + num2;
		
		String nomeAluno = "Janaina";
		int idade = 29;
		double saldoConta = 10.10;
		
		//Dica: sysout ou syso + ctrl espa�o
		//ln faz quebrar a linha
		System.out.println(numero);
		System.out.println(precoDaCamisa);
		System.out.println(nome);
		System.out.println(sexo);
		
		precoDaCamisa = 50.65;
		System.out.println(precoDaCamisa);
		System.out.println();
		System.out.println();
		
		System.out.print(nome); //sem o ln fica tudo junto
		System.out.print(sexo);
		System.out.print(precoDaCamisa);
		System.out.println(); //pula linha
		System.out.println();
		
		//concatena��o
		System.out.print(nome + " " + sexo + " " + " " + precoDaCamisa);
		System.out.println();
		
		System.out.print(nome + " comprou uma camisa com o valor de: " + precoDaCamisa);
		System.out.println();
		
		nome = "Janaina";
		precoDaCamisa = 99.99;
		
		System.out.print(nome + " comprou uma camisa com o valor de: " + precoDaCamisa);
		System.out.println();
		
		System.out.println(2 + 2);
		
		
		System.out.println(num1 + num2);
		System.out.println("O resultado �: " + resultado);
		System.out.println("O resultado �: " + (num1 + num2));
		
		
		System.out.println(nomeAluno + " tem " + idade + " anos e possui " + saldoConta + " reais na conta");
		
	}

}
