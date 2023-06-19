package entities;

public class ContaPoupanca  extends Conta{

	public ContaPoupanca() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(String nomeTitular, int agencia, int numeroConta) {
		super(nomeTitular, agencia, numeroConta);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void sacar(double saque) {
		// TODO Auto-generated method stub
		saldo -= saque + 2;
	}
	

}
