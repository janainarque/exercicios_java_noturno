package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		double valorHora;
		double quantidadeHorasMes;
		
		System.out.println("Quanto voc� ganha por hora? ");
		valorHora = leia.nextDouble();
		
		System.out.println("Quantas horas trabalhadas no m�s? ");
		quantidadeHorasMes = leia.nextDouble();
		System.out.println();
		
		
		System.out.println("O seu sal�rio no m�s foi de " + (valorHora * quantidadeHorasMes) + " reais");
		
		
		leia.close();

	}

}
