package entities;

public class Produto {
	
	public String descricao;
	public int quantidade;
	public double preco;
	public double valorTotalEstoque;

	
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double getValorTotalEmEstoque() {
        return valorTotalEstoque;
    }
    
    public void atualizarValorTotalEstoque() {
    	valorTotalEstoque = quantidade * preco;
    }
    
    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
        atualizarValorTotalEstoque();
    }
    
    public void removerProduto(int quantidade) {
        this.quantidade -= quantidade;
        atualizarValorTotalEstoque();
    }
    
    @Override
    public String toString() {
        return "Descrição: " + descricao +
               "\nQuantidade: " + quantidade +
               "\nPreço: " + preco +
               "\nValor total em estoque: " + valorTotalEstoque;
    }

}
