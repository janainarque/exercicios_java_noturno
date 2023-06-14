package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Janaina"); //Toda vez que cria um add, cria um nó
		nomes.add("Arque");
		nomes.add("Da");
		nomes.add("Silva");
		
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		
		//System.out.println(nomes.get(1)); //acessa a posição que colocar
		
		//remove os dados da lista
		//nomes.remove(2);
		
		for(String nome: nomes) {
			System.out.println("nome: " + nome);
		}
		//obtem o dados da lista por indice (posição na memoria)
		System.out.println(nomes.get(3));
		
		/* declarou uma variavel string com nome dados 
		 * o x é o nomes nesse caso, então  x(nomes)  tal que(==) "Janainas", se for igual ele retorna o valor, 
		 * se não não achar que é o findFirst ele vai retornar null
		*/
		String dado = nomes.stream().filter(x -> x == "Janainas").findFirst().orElse(null);
		
		//System.out.println(dado);
		Collections.sort(nomes);
		System.out.println("Imprimindo em ordem alfabetica");
		for(String nome : nomes) {
			System.out.println("Nome1: " + nome);
		}
		
		System.out.println(dado);

	}

}
