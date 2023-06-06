package entities;

public class Conta {
	
	public int numeroConta;
	public int agencia;
	public int salario;
	public double saldo;
	public String titular;
	
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getSalario() {
		return salario;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}

	public void sacar(double valorSacado) {
		saldo -= valorSacado;
	}

	public String toString() {
		//return super.toString();
		//return "aqui vai texto";
		return "Titular: " + titular + "\nAgência: " + agencia + "\nConta: " + numeroConta + "\nSaldo: " + saldo;
	}

}
