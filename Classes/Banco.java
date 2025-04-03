package Classes;

public class Banco {

	//Atributos
	private int numero_conta;   //Nunca pode ser alterado depois de criado
	private double saldo;
	private String titular;      //Pode ser alterado por razoes de casamento

	//Construtores
	public Banco(int numero_conta, String titular, double saldo) {
		this.numero_conta = numero_conta;
		this.titular = titular;
		this.saldo = saldo;
	}


	//Encapsulamento numero de conta - get
	public int getNumero_Conta(){
		return numero_conta;
	}

	//Encapsulamento saldo - get
	public double getSaldo(){
		return saldo;
	}

	//Encapuslamento titular - get e set
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	//Metados
	public void adicionarSaldo(double saldo) {
		this.saldo += saldo;
	}

	public void retirarSaldo(double valor) {
		this.saldo -= valor;  // Subtrai o valor do saque
		this.saldo -= 5;      // Aplica a taxa de R$5 separadamente
	}

	public String toString() {
		return "Account " + getNumero_Conta() + ", Holder: " + getTitular() + ", Balance $" +getSaldo();
	}



}
