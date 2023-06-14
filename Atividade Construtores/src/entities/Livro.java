package entities;

public class Livro {
	
	/* 
	 * Ordens sugeridas a seguir na classe:
	 * 1° atributos da classe
	 * 2° Construtores
	 * 3° Metodos get e set
	 * 4° demais metodos 
	 * 
	 */

	private String nome;
	private String edicao;
	private double valor;
	
	//usar esse metodo construtor quando todos os campos forem obrigatorios
	public Livro(String nome, String edicao, double valor) {
		super();
		this.nome = nome; // this é a palavra reservada, que diferencia o que é atributo da classe pro parametro recebido 
		this.edicao = edicao;
		this.valor = valor;
	}

	
	//get é para obter 
	public double getValor() {
		return valor;
	}

	//set é para atribuir
	public void setValor(double valor) {
		if(valor > 100) {
			this.valor += (valor * 0.30);
		}else {
			this.valor = valor;
		}
	}
	
	@Override
	public String toString() {
		return "Nome do livro: " + nome +
				"\nEdição: " + edicao +
				"\nValor: " + valor;
	}
	
	
	
}
