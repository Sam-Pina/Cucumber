package com.qualidadeSam;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {

	int clienteEspecialSaldo = -200;
	int saqueClienteEspecial = 100;
	int clienteEspecialSaldoAtt = clienteEspecialSaldo - (saqueClienteEspecial);
	int clienteComumSaldo = -300;
	int saqueClienteComum = 200;
	
	/**
	 * Cenario 1 - Cliente Especial - Saldo atual
	 * 
	 * Nessa etapa do codigo o cliente especial possui um saldo negativo de 200 reais, setados na variavel clienteEspecialSaldo, onde o valor dessa variavel é Inteiro.
	 * Como base desse cenario utilizamos o Given (dado que), e apartir dele começamos desenvolver.
	 * 
	 * @author Samuel
	 * @param reais
	 */
	@Given("Um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer reais) {
		Conta clienteEspecial = new Conta();
		
		clienteEspecial.um_cliente_especial_com_saldo_atual_de_reais(clienteEspecialSaldo);
		System.out.println("Cliente Especial com saldo de " + clienteEspecialSaldo);
		throw new io.cucumber.java.PendingException();
	}

	/**
	 * Cenario 1 - Cliente Especial - Saldo atual
	 * 
	 * Nessa etapa do codigo o cliente especial deseja realizar um saque, porem ele esta com saldo negativo, mas como beneficio pode sacar adicionando o tal saque em sua divida.
	 * Entao quando ele solicitar um valor X (de exemplo setamos na variavel saqueClienteEspecial, o valor 100 ), o sistema deverá liberar esse saque adicionando-o em sua divida atual
	 * 
	 * Como base desse cenario utilizamos o When (quando), e apartir dele começamos desenvolver.
	 * @author Samuel
	 * @param reais
	 */
	@When("For solicitado um saque no valor de {int} reais")
	public boolean for_solicitado_um_saque_no_valor_de_reais(Integer reais) {
		Conta saqueClienteE= new Conta();
		
		saqueClienteE.for_solicitado_um_saque_no_valor_de_reais(saqueClienteEspecial);
		System.out.println("For solicitado um saque de " + saqueClienteEspecial);
		throw new io.cucumber.java.PendingException();
	}

	/**
	 * Cenario 1 - Cliente Especial - Efetuar saque e atualizar o saldo da conta
	 * 
	 * Nessa etapa do codigo o cliente especial já realizou seu saque e o sistema deverá atualizar sua nova divida, de acordo com valor sacado
	 * 
	 * Como base desse cenario utilizamos o Then (entao), e apartir dele começamos desenvolver.
	 * 
	 * @author Samuel
	 * @param reais
	 */
	@Then("Deve efetuar o saque e atualizar o saldo da conta para {int} reais.")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer reais) {
		Conta saldoAtt = new Conta();
		
		saldoAtt.for_solicitado_um_saque_no_valor_de_reais(clienteEspecialSaldoAtt);
		System.out.println("Deve efetuar o saque e atualizar a conta para " + clienteEspecialSaldoAtt);
		throw new io.cucumber.java.PendingException();
	}

	/**
	 * Cenario 2 - Cliente Comum - Saldo atual
	 * 
	 * Nessa etapa do codigo o cliente comum possui um saldo negativo de 300 reais, setados na variavel clienteComumSaldo, onde o valor dessa variavel é Inteiro.
	 * Como base desse cenario utilizamos o Given (dado que), e apartir dele começamos desenvolver.
	 * 
	 * @author Samuel
	 * @param reais
	 */
	@Given("Um cliente comum com saldo atual de {int} reais")
	public void um_cliente_comum_com_saldo_atual_de_reais(Integer reais) {
		Conta contaComum = new Conta();
		
		contaComum.um_cliente_comum_com_saldo_atual_de_reais(clienteComumSaldo);
		System.out.println("Cliente Comum com saldo de " + clienteComumSaldo);
		throw new io.cucumber.java.PendingException();
	}

	/**
	 * Cenario 2 - Cliente Comum - Solicitação de saque
	 * 
	 * Nessa etapa do codigo o cliente comum deseja realizar um saque, porem ele esta com saldo negativo, entao nao conseguira realizar esse saque, ele so conseguiria 
	 * se fosse um cliente especial.
	 * 
	 * Como base desse cenario utilizamos o When (quando), e apartir dele começamos desenvolver.
	 * @author Samuel
	 * @param reais
	 */
	@When("solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer reais) {
		Conta contaComum = new Conta();
		
		contaComum.solicitar_um_saque_de_reais(saqueClienteComum);
		System.out.println("For solicitado um saque de " + saqueClienteComum);
		throw new io.cucumber.java.PendingException();
	}

	/**
	 * Cenario 2 - Cliente Comum - Efetuar saque e atualizar o saldo da conta
	 * 
	 * Nessa etapa do codigo o cliente comum apos ter seu saque negado, o sistema deverá informar uma mensagem de "saldo insuficiente", bloqueando a retirada do dinheiro.
	 * 
	 * Como base desse cenario utilizamos o Then (entao), e apartir dele começamos desenvolver.
	 * 
	 * @author Samuel
	 * @param reais
	 */
	@Then("Nao deve efetuar o saque e deve retornar a mensagem saldo insuficiente")
	public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
		System.out.println("Saldo insuficiente");
		throw new io.cucumber.java.PendingException();
	}

}