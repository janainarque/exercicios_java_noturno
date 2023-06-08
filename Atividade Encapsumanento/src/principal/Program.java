package principal;

import java.util.Scanner;

import entities.Produto;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();

        //produto.setDescricao("Produto");
        System.out.println("Informe o nome do Produto: ");
		produto.setDescricao(sc.nextLine());
          
        
		//produto.setQuantidade(10);
        System.out.println("Informe a quantidade: ");
		produto.setQuantidade(sc.nextInt());
        
        //produto.setPreco(5.0);
        System.out.println("Informe a quantidade: ");
		produto.setPreco(sc.nextDouble());
        
        produto.atualizarValorTotalEstoque();
        
        System.out.println();
        System.out.println("Dados iniciais:");
        System.out.println(produto);
        
        produto.adicionarProduto(5);
        
        System.out.println();
        System.out.println("Dados após inserção:");
        System.out.println(produto);
        
        produto.removerProduto(3);
        
        System.out.println();
        System.out.println("Dados após venda:");
        System.out.println(produto);
        
		
		sc.close();

	}

}
