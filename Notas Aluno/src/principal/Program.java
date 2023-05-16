package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		
		double media;
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = leia.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = leia.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		double nota3 = leia.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		double nota4 = leia.nextDouble();
		System.out.println();
		
		media = ((nota1 + nota2 + nota3 + nota4)/4);
		
		if(media < 6) {
			System.out.println("Aluno reprovado com a media " + media);
		}
		else if(media >= 6 && media < 7 ) { 
			System.out.println("Aluno de recuperação com a media " + media);
		}
		else if(media >= 7 && media < 10){
			System.out.println("Aluno aprovado com a media " + media);
		}
		else if(media == 10){
			System.out.println("Aluno aprovado com honras media " + media);
		}
			
		leia.close();
		
		

	}

}
