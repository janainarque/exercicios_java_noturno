package principal;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] numeros = new int[3][3]; //matriz 3 por 3 -> 3 linhas e 3 colunas 
		
		int contador = 1;
		
		for(int i = 0; i < numeros.length; i++) { //for para percorrer a linha
			for(int j = 0; j < numeros.length; j++) { //for para percorrer a coluna
				numeros[i][j] = contador;
				System.out.print(numeros[i][j] + "\t");
				contador++;
			}
			System.out.println();
		}
		
		System.out.println();
		
		//for que imprime somente a diagonal principal da matriz
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < i; j++){
				System.out.print("    	");
			}
			System.out.println(numeros[i][i]);
		}
		
		

	}

}
