package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random aleatorio = new Random();
		
		int NumeroDado1 = aleatorio.nextInt(6) + 1;
		int NumeroDado2 = aleatorio.nextInt(6) + 1;
		int NumeroDado3 = aleatorio.nextInt(6) + 1;
		int somaDados;
		int bonus = 0;
		int totalSoma;
		
		somaDados = (NumeroDado1 + NumeroDado2 + NumeroDado3);
		
		if(NumeroDado1 == NumeroDado2 && NumeroDado2 == NumeroDado3) {
			bonus = 6;
			System.out.println("Você é muito sortudo");
		}
		else if(NumeroDado1 == NumeroDado2 || NumeroDado2 == NumeroDado3 ||  NumeroDado3 == NumeroDado1) {
			bonus = 2;
		}
		
		totalSoma = (somaDados + bonus);
		
		System.out.println("Valor do primeiro dado: " + NumeroDado1);
		System.out.println("Valor do segundo dado: " + NumeroDado2);
		System.out.println("Valor do terceiro dado: " + NumeroDado3);
		System.out.println("A soma dos dados foi de: " + somaDados);
		System.out.println("Você teve " + bonus + " pontos de bonus");
		System.out.println("Seus pontos totais foi de: " + totalSoma + " pontos");
		
		if(totalSoma < 15) {
			System.out.println("Mas lamento, você perdeu!");
		}
		else {
			System.out.println("Parabéns, você ganhou!");
		}
		
		
		
		
		
		

	}

}
