package entities;

public class ContaCorrente extends Conta{

	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(String nomeTitular, int agencia, int numeroConta) {
		super(nomeTitular, agencia, numeroConta);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sacar(double saque) {
		// TODO Auto-generated method stub
		saldo -= saque + 5;
	}

}
