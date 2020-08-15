package br.com.bank.test;

import br.com.bank.modelo.Conta;

public class TestaValores {

	public static void main(String[] args) {

		Conta conta1 = new Conta(12, 15);
		Conta conta2 = new Conta(1, 20);

		conta1.deposita(200.0);
		conta1.saca(100.0);
		conta1.transfere(100, conta2);
		System.out.println("Conta 2: " + conta2.Saldo());
		System.out.println("Conta 1: " + conta1.Saldo());
		conta1.totalContasAbertas();

	}

}
