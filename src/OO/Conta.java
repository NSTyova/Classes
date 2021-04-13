package OO;

public class Conta {

	private double saldo = 100;
	private int agencia;
	private int numero;
	private Cliente titular;
	// referencia que o atributo e da classe
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total ++;
		System.out.println("O total de contas é:  " + total);
		if(agencia <=0) {
			System.err.println("A agencia nao pode ter valores menores ou igual a 0");
		}
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando um conta" + this.agencia);
	}
	
	public void depositar(double valor){
		this.saldo = saldo +valor;
	}
	
	public boolean levantar(double valor){
		if(this.saldo > valor) {
			this.saldo = this.saldo - valor;
			return true;
		}
		return false;
	}
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >=valor) {
			this.saldo =this.saldo -valor;
			destino.depositar(valor);
			return true;
		}else {
			return false;
		}
		
	}
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public static int getTotal() {
		return Conta.total;
	}
}
