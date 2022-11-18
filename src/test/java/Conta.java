import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {
	
	boolean clienteEspecial = false;
	
	int solicitasaqueEspecial, solicitasaqueComum, saldoEspecialAtual, saldoEspecial, saldoComumAtual, saldoComum, num;
	
	String erro = "Falha no processo";
	String erro2 = "saldo insuficiente";

	Cliente cliente = new Cliente();
	
	/**
	 * Cenario 1 - Cliente Especial - Saldo atual
	 * 
	 * Nessa etapa do codigo o cliente especial possui um saldo negativo de 200 reais, setados na variavel clienteEspecialSaldo, onde o valor dessa variavel será Inteiro.
	 * Como base desse cenario utilizamos o Given (dado que), e apartir dele começamos desenvolver.
	 * @param saldo atual cliente especial
	 */
	
	@Given("Um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
		
		num = int1;
		
		cliente.setSaldoEspecial(int1);
		saldoEspecial = cliente.getSaldoEspecial();

		if (saldoEspecial != num) {

			throw new io.cucumber.java.PendingException(erro);
			
		}
	}
	
	/**
	 * Cenario 1 - Cliente Especial - Efetuar saque e atualizar o saldo da conta
	 * 
	 * Nessa etapa do codigo o cliente especial já realizou seu saque e o sistema deverá atualizar sua nova divida, de acordo com valor sacado
	 * Como base desse cenario utilizamos o Then (entao), e apartir dele começamos desenvolver.
	 * @param novo saldo cliente especial
	 */

	@When("For solicitado um saque no valor de {int} reais")
	public void for_solicitado_um_saque_no_valor_de_reais(Integer int1) {

		num = int1;
		
		cliente.setSaqueEspecial(int1);
		solicitasaqueEspecial = cliente.getSaqueEspecial();
		
		if (solicitasaqueEspecial != num) {
			
			throw new io.cucumber.java.PendingException(erro);
			
		}
	}
	
	/**
	 * Cenario 1 - Cliente Especial - Efetuar saque e atualizar o saldo da conta
	 * 
	 * Nessa etapa do codigo o cliente especial já realizou seu saque e o sistema deverá atualizar sua nova divida, de acordo com valor sacado
	 * Como base desse cenario utilizamos o Then (entao), e apartir dele começamos desenvolver.
	 * @param novo saldo cliente especial
	 */

	@Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {
		
		if (clienteEspecial = true) {
			
			if(saldoEspecial < 0 || saldoEspecial >= 0) {
				
				cliente.setSaldoEspecial(int1);
				saldoEspecialAtual = cliente.getSaldoEspecial();
				
			}
		
		} else {
			
			throw new io.cucumber.java.PendingException(erro);
			
		}
	}
	/**
	 * Cenario 2 - Cliente Comum - Saldo atual
	 * 
	 * Nessa etapa do codigo o cliente comum possui um saldo negativo de 300 reais, onde o valor da variavel será Inteiro. Não permitindo o mesmo de realizar um saque
	 * Como base desse cenario utilizamos o Given (dado que), e apartir dele começaamos desenvolver.
	 * 
	 * @param saldo atual cliente comum
	 */
	
	@Given("Um cliente comum com saldo atual de {int} reais")
	public void um_cliente_comum_com_saldo_atual_de_reais(Integer int1) {

		num = int1;
		
		cliente.setSaldoComum(int1);
		saldoComum = cliente.getSaldoComum();
		
		if (saldoComum != num) {

			throw new io.cucumber.java.PendingException(erro);
			
		}
	}

	/**
	 * Cenario 2 - Cliente Comum - Solicitação de saque
	 * 
	 * Nessa etapa do codigo o cliente comum deseja realizar um saque, porem ele esta com saldo negativo, entao nao conseguira realizar esse saque, ele so conseguiria 
	 * se fosse um cliente especial.
	 * Como base desse cenario utilizamos o When (quando), e apartir dele começamos desenvolver.
	 * @param cliente comum solicita saque
	 */

	@When("Solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer int1) {
		
		num = int1;
		
		cliente.setSaqueComum(int1);
		solicitasaqueComum = cliente.getSaqueComum();
		
		if(solicitasaqueComum != num) {
		
		throw new io.cucumber.java.PendingException(erro);
		
		}
	}

	/**
	 * Cenario 2 - Cliente Comum - Efetuar saque e atualizar o saldo da conta
	 * 
	 * Nessa etapa do codigo o cliente comum apos ter seu saque negado, o sistema deverá informar uma mensagem de "saldo insuficiente", bloqueando a retirada do dinheiro.
	 * Como base desse cenario utilizamos o Then (entao), e apartir dele começaamos desenvolver.
	 * @param cliente comum teve seu saque recusado
	 */
	@Then("Nao deve efetuar o saque e deve retornar a mensagem saldo insuficiente")
	public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
		
		if(clienteEspecial == false) {
			
			if(saldoComum > 0) 
				cliente.setSaqueComum(solicitasaqueComum);

		} else {
			
		throw new io.cucumber.java.PendingException(erro2);
		
		}
	}
}
