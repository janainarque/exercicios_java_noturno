package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Digite um tipo de opera��o seja ela soma, divis�o, multiplica��o, subtra��o: ");
        String operacao = sc.nextLine();
        System.out.print("Digite o n�mero: ");
        int num = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            if (operacao.equals("soma")) {
                System.out.println(num + " + " + i + " = " + (num + i));
            } else if (operacao.equals("subtra��o")) {
                System.out.println((num + i) + " - " + num + " = " + i);
            } else if (operacao.equals("multiplica��o")) {
                System.out.println(num + " * " + i + " = " + (num * i));
            } else if (operacao.equals("divis�o")) {
                System.out.println((num * i) + " / " + num + " = " + i);
            }
        }
	
        
        sc.close();
		
	}

	

}
