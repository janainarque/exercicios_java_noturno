package entities;


public class Conta {
	
	private String nomeTitular;
	private int numeroConta;
	private int agencia;
	protected double saldo;
	

	public Conta() {
		super();
	}
	
	
	public Conta(String nomeTitular, int agencia, int numeroConta) {
		super();
		this.nomeTitular = nomeTitular;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
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
	
	public void depositar(double deposito) {
		saldo += deposito;
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
