package entities;


public class Conta {
	
	private String nomeTitular;
	private int agencia;
	private int numeroConta;
	private double saldo;
	

	public Conta() {
		super();
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double deposito) {
		saldo -= deposito;
	}
	
	public void sacar(double saque) {
		saldo -= saque;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Titular da conta: " + nomeTitular +
				"\nAgência: " + agencia +
				"\nConta: " + numeroConta;
	}

}
