package principal;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Uma constante é quando seu valor não muda
		final double PI = 3.1415;
		int valor1 = 50;
		int valor2 = 65;
		
		//realiza a potencia ou seja 2 elevado a 2 no caso da linha abaixo
		System.out.println(Math.pow(2, 2));
		
		//passagem de 2 numeros como paramentro
		//retorna o maior deles
		System.out.println(Math.max(5, 20));
		System.out.println(Math.max(valor2, valor1));//ou pode ser usado assim também como variavel no lugar do valor, as duas formas estão corretas
		
		//é o inverso do max, pega o minimo
		System.out.println(Math.min(5, 20));
		
		//retorno a raiz quadrada de um numero
		System.out.println(Math.sqrt(4));

		//arredonde o numero (para mais ou para menos)
		System.out.println(Math.round(25.6578));
		
		//podemos realizar calculos com valores
		//retorbadis pelo calculo de Math
		System.out.println(2 + Math.sqrt(4));
		
		Scanner leia = new Scanner(System.in);
		Locale ponto = new Locale("en", "us");//comando que pode usar somente ponto 
		
		System.out.println("Entre com o valor do dolar: ");
		double dolar = leia.useLocale(ponto).nextDouble();
		
		System.out.println("Valor dolar digitadi: " + dolar);
		System.out.println();
		
		String nome = "Janaina Arque";
		char sexo = 'F';
		int idade = 29; 
		double altura = 1.64444443;
		
		System.out.printf("O meu nome é %s, sou do sexo %c, tenho %d anos, minha altura é: %.2f", nome, sexo, idade, altura); //2f que dizer que mostra somente 2 casas decimais depois do ponto
		
		/*
		 * operadores de comparação
		 * > maior que
		 * < menor que 
		 * >= maior ou igual a
		 * <= menor ou igual a 
		 * != diferente de 
		 * == igual a
		 */
		
		/*
		 * operadores logicos
		 * && é o mesmo que e 
		 * || é o mesmo que ou 
		 * ! é o mesmo que negação
		 */
		
		
		
		
		
		
		leia.close();

	}

}
