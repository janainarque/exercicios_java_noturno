package principal;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		
		
		System.out.println("Entre com o titular da conta: ");
		conta.setNomeTitular(sc.nextLine());
		
		System.out.println("Entre com o número da conta: ");
		conta.setNumeroConta(sc.nextInt());
		

		System.out.println("Entre com a agência da conta: ");
		conta.setAgencia(sc.nextInt());
		
		
		System.out.println("Entre com o valor do deposito: ");
		conta.depositar(sc.nextDouble());
		
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		
		System.out.println("Entre com o valor do saque: ");
		conta.sacar(sc.nextDouble());
		
		
		
		sc.close();

	}

}
