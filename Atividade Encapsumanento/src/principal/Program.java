package principal;

import java.util.Scanner;

import entities.Produto;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();

		
        System.out.println("Informe o nome do Produto: ");
		produto.setDescricao(sc.nextLine());
          
        System.out.println("Informe a quantidade a ser adicionada no estoque: ");
		produto.adicionarProduto(sc.nextInt());
        
        System.out.println("Informe o valor unitário: ");
		produto.setPreco(sc.nextDouble());
        

        System.out.println(produto);
        
       
        System.out.println("Quantidade a ser removida: ");
        produto.removerProduto(sc.nextInt());
        
        
        System.out.println(produto);
        
		sc.close();

	}

}
