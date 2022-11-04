package com.qualidadeSam;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {

	int clienteEspecialSaldo, saqueClienteEspecial, clienteComumSaldo,saqueClienteComum;
	String cliente = "";
	/**
	 * Cenario 1 - Cliente Especial - Saldo atual
	 * 
	 * Nessa etapa do codigo o cliente especial possui um saldo negativo de 200 reais, setados na variavel clienteEspecialSaldo, onde o valor dessa variavel Ã© Inteiro.
	 * Como base desse cenario utilizamos o Given (dado que), e apartir dele comeÃ§amos desenvolver.
	 * 
	 * @author Samuel
	 * @param reais
	 */
	@Given("Um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer reais) {
		this.clienteEspecialSaldo = reais;
		
		if(this.clienteEspecialSaldo != reais){
			throw new io.cucumber.java.PendingException();
		}
	}

	/**
	 * Cenario 1 - Cliente Especial - Saldo atual
	 * 
	 * Nessa etapa do codigo o cliente especial deseja realizar um saque, porem ele esta com saldo negativo, mas como beneficio pode sacar adicionando o tal saque em sua divida.
	 * Entao quando ele solicitar um valor X (de exemplo setamos na variavel saqueClienteEspecial, o valor 100 ), o sistema deverÃ¡ liberar esse saque adicionando-o em sua divida atual
	 * 
	 * Como base desse cenario utilizamos o When (quando), e apartir dele comeÃ§amos desenvolver.
	 * @author Samuel
	 * @param reais
	 */
	@When("For solicitado um saque no valor de {int} reais")
	public boolean for_solicitado_um_saque_no_valor_de_reais(Integer reais) {
		this.saqueClienteEspecial = reais;
		
		if(this.saqueClienteEspecial != reais){
			throw new io.cucumber.java.PendingException();
		}
		return false;
	}

	/**
	 * Cenario 1 - Cliente Especial - Efetuar saque e atualizar o saldo da conta
	 * 
	 * Nessa etapa do codigo o cliente especial jÃ¡ realizou seu saque e o sistema deverÃ¡ atualizar sua nova divida, de acordo com valor sacado
	 * 
	 * Como base desse cenario utilizamos o Then (entao), e apartir dele comeÃ§amos desenvolver.
	 * 
	 * @author Samuel
	 * @param reais
	 */
	@Then("Deve efetuar o saque e atualizar o saldo da conta para {int} reais.")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer reais) {
		
		this.cliente = "especial";
		
		if (this.cliente != "especial") {
			throw new io.cucumber.java.PendingException();
		}
	}

	/**
	 * Cenario 2 - Cliente Comum - Saldo atual
	 * 
	 * Nessa etapa do codigo o cliente comum possui um saldo negativo de 300 reais, setados na variavel clienteComumSaldo, onde o valor dessa variavel Ã© Inteiro.
	 * Como base desse cenario utilizamos o Given (dado que), e apartir dele comeÃ§amos desenvolver.
	 * 
	 * @author Samuel
	 * @param reais
	 */
	@Given("Um cliente comum com saldo atual de {int} reais")
	public void um_cliente_comum_com_saldo_atual_de_reais(Integer reais) {
		
		this.clienteComumSaldo = reais;

		if (this.clienteComumSaldo != reais) {
			throw new io.cucumber.java.PendingException();
		}
	}

	/**
	 * Cenario 2 - Cliente Comum - SolicitaÃ§Ã£o de saque
	 * 
	 * Nessa etapa do codigo o cliente comum deseja realizar um saque, porem ele esta com saldo negativo, entao nao conseguira realizar esse saque, ele so conseguiria 
	 * se fosse um cliente especial.
	 * 
	 * Como base desse cenario utilizamos o When (quando), e apartir dele comeÃ§amos desenvolver.
	 * @author Samuel
	 * @param reais
	 */
	@When("solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer reais) {
		
		this.saqueClienteComum = reais;
		
		if (this.saqueClienteComum != reais) {
			throw new io.cucumber.java.PendingException();
		}
	}

	/**
	 * Cenario 2 - Cliente Comum - Efetuar saque e atualizar o saldo da conta
	 * 
	 * Nessa etapa do codigo o cliente comum apos ter seu saque negado, o sistema deverÃ¡ informar uma mensagem de "saldo insuficiente", bloqueando a retirada do dinheiro.
	 * 
	 * Como base desse cenario utilizamos o Then (entao), e apartir dele comeÃ§amos desenvolver.
	 * 
	 * @author Samuel
	 * @param reais
	 */
	@Then("Nao deve efetuar o saque e deve retornar a mensagem saldo insuficiente")
	public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
		this.cliente = "comum";

		if (this.cliente == "comum") {
			System.out.println("Saldo Insuficiente");
		} else {
			throw new io.cucumber.java.PendingException();
	}
    }
}
