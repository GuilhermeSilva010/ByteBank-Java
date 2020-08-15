package br.com.bank.test;

import br.com.bank.modelo.Cliente;
import br.com.bank.modelo.Conta;

public class TestGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(1221, 20191);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		Cliente guilherme = new Cliente ();
		
		guilherme.setCpf("52099956299");
		guilherme.setNome("guilherme");
		conta.setTitular(guilherme);
		conta.getTitular().setProfissao("programador");
		
		System.out.println(guilherme.getCpf());
		System.out.println(conta.getTitular().getNome());

	}
}
