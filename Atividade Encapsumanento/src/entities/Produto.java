package entities;

public class Produto {
	
	public String descricao;
	public int quantidade;
	public double preco;

	
	
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;  /*this sempre está ligado ao atribudo da classe */
    }
    
    public void removerProduto(int quantidade) {
        this.quantidade -= quantidade;
    }
    
    public double retornaTotalEmEstoque() {
        return quantidade * preco;
    }
    
    
    @Override
    public String toString() {
        return "Produto: " + descricao +
               "\nQuantidade: " + quantidade +
               "\nTotal em estoque: " + String.format("%.2f", retornaTotalEmEstoque());
    }

}
