package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Atividade la�os de repeti��o - exercicio 2 
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		int opcao = 0;
		
		System.out.println("Deseja entrar no la�o ? ");
		System.out.println("1 = sim ou 2 = n�o");
		opcao = sc.nextInt();
		
		while(opcao == 1) {
			contador ++;
			System.out.println("Deseja entrar no la�o ? ");
			System.out.println("1 = sim ou 2 = n�o");
			opcao = sc.nextInt();
			
		}
		System.out.println("Entrou " + contador + " vezes");
		
		sc.close();
			
	}

}
