package principal;

import java.util.Random;
import java.util.Scanner;

public class Program {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner sc = new Scanner(System.in);
	        Random random = new Random();
	        
	        String[] pessoas = new String[10];
	        
	        // Cadastro das pessoas
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
	            pessoas[i] = sc.nextLine();
	        }
        
	        // Sorteio do ganhador
	        int indiceGanhador = random.nextInt(10);
	        String ganhador = pessoas[indiceGanhador];
	        
	        System.out.println("O ganhador da próxima turma de Java do SENAI é: " + ganhador);
	        
	        sc.close();

	} */
	
	
	public static void main(String[] args) {
		System.out.println(ganhador());
		
	}
	
	static String ganhador() {
		Random random = new Random();
		int numeroSorteado = random.nextInt(11);
		String[] nomes = {"Janaina", "Weden", "Jose", "Luan", "Claudia", "Mateus", "Leone", "Andre", "Fernanda", "Elson", "Guilherme"};
		return "O ganhador foi: " + nomes[numeroSorteado];
	}

}
