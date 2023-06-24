package principal;

import java.util.Scanner;

public class ConversorDolarReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double taxaDeCambio = 5.02; // taxa de câmbio dia 29/05/2023
        double valor;
        double valorConvertido;
        int opcao;

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor a ser convertido: ");
        valor = Double.parseDouble(sc.nextLine());

        System.out.println("\n1. Converter de Real para Dólar");
        System.out.println("2. Converter de Dólar para Real");
        System.out.print("Sua opção: ");
        opcao = Integer.parseInt(sc.nextLine());

        if (opcao == 1) {
            valorConvertido = converterRealParaDolar(valor, taxaDeCambio);
            System.out.printf("O valor convertido para Dólar é: $ %.2f", valorConvertido);
        } else if (opcao == 2) {
            valorConvertido = converterDolarParaReal(valor, taxaDeCambio);
            System.out.printf("O valor convertido para Real é: R$ %.2f", valorConvertido);
        } else {
            System.out.println("Opção inválida.");
        }
        
        sc.close();
    }

    public static double converterRealParaDolar(double valor, double taxaDeCambio) {
        return valor / taxaDeCambio;
    }

    public static double converterDolarParaReal(double valor, double taxaDeCambio) {
        return valor * taxaDeCambio;
    }		
		
	

}