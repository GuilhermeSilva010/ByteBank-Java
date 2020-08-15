package br.com.bank.modelo;

public class Conta {
	private int numero;
	private double saldo;
	private int agencia;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		if( agencia <= 0 || numero <= 0){
			System.out.println("Erro, não pode numeros menores que 0");
			return;
		}
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta agencia " + this.agencia);
	}
	
	public void totalContasAbertas() {
		System.out.println("o total de contas é " + Conta.total);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;

	}

	public String saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return "Transação com sucesso!";
		} else {
			return "Valor insuficiente";
		}
	}

	public String transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return "Transferencia com sucesso";
		}
		return "Transferencia negada";
	}

	public double Saldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}
	

	public int getAgencia() {
		return this.agencia;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public static int getTotal(){
		return Conta.total;
	}
	
}
