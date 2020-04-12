package entities;

public class Account {
	private int acNumber;
	private String userName;
	private double value;

	// -- Constructor
	public Account(String userName, int acNumber) {
		this.acNumber = acNumber;
		this.userName = userName;
	}

	public Account(String userName, int acNumber, double InitialValue) {
		this.acNumber = acNumber;
		this.userName = userName;
	    Deposito(InitialValue);
	}

	// -- Setters and getters
	public int getAcNumber() {
		return acNumber;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Double getValue() {
		return value;
	}

	// -- Métodos

	public void Saque(double saque) {

		
		this.value -= (saque + 5.0);

	}

	public void Deposito(double deposito) {

		value += deposito;

	}

	public void Saldo() {
		String Saldo;

		Saldo = " \n Dados da conta: \n Account: " + acNumber + ", Titular: " + userName + ", Saldo: R$ " + value;

		System.out.println(Saldo);
		;
	}
	
	public String toString() {
		
		return " \n Dados da conta: \n Account: " 
		+ acNumber 
		+ ", Titular: " 
		+ userName 
		+ ", Saldo: R$ " 
		+ String.format("%.2f", value);
		
	}
	

}
