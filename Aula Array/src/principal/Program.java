package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* int[] numeros = new int[5];
		int[] numeros2 = {100, 250, 02, 25, 88};
		String[] nomes = new String[3];
		
		//varival numero na posição 0 recebe 10;
		numeros[0] = 10;
		numeros[1] = 25;
		numeros[2] = 1;
		numeros[3] = 99;
		numeros[4] = 33;
		
		System.out.println(numeros[4]);
		System.out.println(numeros2[2]); */
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Quantos nomes deseja salvar na memoria? ");
		int qtd = sc.nextInt();
		sc.nextLine();//vai para proxima linha
		
		String[] nomes = new String[qtd];
		//for para inserir os dados
		for(int contador = 0; contador < nomes.length; contador++) {
			System.out.print("Entre com o nome: ");
			nomes[contador] = sc.nextLine();
		}
		
		//for para exibir os dados
		for(int contador = 0; contador < nomes.length; contador++) {
			System.out.println(nomes[contador]);
		} 
		//pode usar esse for ou o de baixo, que é a mesma coisa, serve para percorrer os dados do array
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		
		String verificar = "Janaina";
		//equals compara o tipo e o valor, usar sempre ele com string
		if(nomes[0].equals(verificar)) {
			System.out.println("é igual");
		} 
		
		
		
		
		
		sc.close();
		
		/*String nome1 = new String("Jana");
		String nome2 = new String("Jana");
		String nome3 = "Jana";
		
		System.out.println(nome1.equals(nome2)); */
		

	}

}
