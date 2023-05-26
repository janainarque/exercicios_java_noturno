package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno: ");
		String nomeAluno = sc.nextLine();

		double[] notas = new double[4];
		double somaNotas = 0;
		
		//for para inserir os dados
		for(int i = 0; i < 4; i++) { // aqui poderia ser escrito assim tbm -> for(int i = 0; i < notas.lenght; i++){
			System.out.print("Informe a " + (i + 1) + "º nota do aluno: ");
			notas[i] = sc.nextDouble();
			somaNotas += notas[i]; //versao mais curta, mas pode ser assim tbm ->       somaNotas = somaNotas + notas[i];
		}
		
		double media = somaNotas / 4;
		
		System.out.println("A média do aluno " + nomeAluno + " é " + media);
		
		sc.close();
		

	}

}
