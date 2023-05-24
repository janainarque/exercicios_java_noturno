package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Digite um tipo de operação seja ela soma, divisão, multiplicação, subtração: ");
        String operacao = sc.nextLine();
        System.out.print("Digite o número: ");
        int num = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            if (operacao.equals("soma")) {
                System.out.println(num + " + " + i + " = " + (num + i));
            } else if (operacao.equals("subtração")) {
                System.out.println((num + i) + " - " + num + " = " + i);
            } else if (operacao.equals("multiplicação")) {
                System.out.println(num + " * " + i + " = " + (num * i));
            } else if (operacao.equals("divisão")) {
                System.out.println((num * i) + " / " + num + " = " + i);
            }
        }
	
        
        sc.close();
		
	}

	

}
