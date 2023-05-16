package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		
		System.out.println("Entre com o primeiro número");
		numero1 = leia.nextInt();
		
		System.out.println("Entre com o segundo número");
		numero2 = leia.nextInt();
		
		System.out.println("Entre com o terceiro número");
		numero3 = leia.nextInt();
		
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O maior número é: " + numero1);
        }
        else if (numero2 > numero3){
        	System.out.println("O maior número é: " + numero2);
        }
        else {
        	System.out.println("O maior número é: " + numero3);
    	}
			
		leia.close();
		

	}

}
