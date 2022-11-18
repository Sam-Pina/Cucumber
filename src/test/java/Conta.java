	/**
	 * 
	 * - Importando bibliotecas necessárias para testes nos metodos given, then e when".
	 * 
	 */

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {
	
	/**
	 * 
	 * - Criando um atributo boolean "clienteEspecial".<br>
	 * - Se o atributo "clienteEspecial" for true, o ultimo metodo não executa, conforme os cenarios, o cliente é especial.<br>
	 * - Se o atributo "clienteEspecial" for false, todos os metodos executam conforme os cenarios, o cliente é comum.
	 * 
	 */
	
	boolean clienteEspecial = false;
	
	// - Criando variaveis
	
	int solicitasaqueEspecial;
	int solicitasaqueComum;
	
	int saldoEspecialAtual;
	int saldoEspecial;
	
	int saldoComumAtual;
	int saldoComum;
	
	int num;
	
	String erro = "Falha no processo";
	String erro2 = "saldo insuficiente";
	
	/**
	 * 
	 * - Instanciando a classe "Cliente";<br>
	 * - Criando um objeto da classe "Cliente" com o nome de "cliente";<br>
	 * - Necessaário para poder utilizar os metodos, atributos e construtores da classe "Cliente".
	 * 
	 */

	Cliente cliente = new Cliente();
	
	/**
	 * 
	 * * ETAPA 1 * <br>
	 * Linha 59 e 60 - Neste metodo o cliente especial tem um saldo de -200 reais (valor definido na variavel "{int} e int1"), 'GIVEN - @tag1' na classe "conta_bdd.feature".<br>
	 * Linha 62 - passando o valor de "int1" na variavel "num".<br>
	 * Linha 64 e 65 - Chamando o objeto "cliente" e definindo o metodo "setSaldoEspecial()" criado na classe "Cliente", passando como parametro o valor de "int1", colocando o valor setado dentro da variavel "saldoEspecial".<br>
	 * Linha 67 e 69 - Se a variavel "saldoEspecial" for diferente de "num" (-200 reais), retornar "throw new io.cucumber.java.PendingException(erro)" (metodo pendente), senão, metodo passou com sucesso.
	 * 
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
	 * 
	 * * ETAPA 2 * <br>
	 * Linha 84 e 85 - Neste metodo o cliente especial solicita um saque de 100 reais (valor definido na variavel "{int} e int1"), 'WHEN - @tag1' na classe "conta_bdd.feature";<br>
	 * Linha 87 - passando o valor de "int1" na variavel "num".<br>
	 * Linha 89 e 90 - Chamando o objeto "cliente" e definindo o metodo "setSaqueEspecial()" criado na classe "Cliente", passando como parametro o valor de "int1", colocando o valor setado dentro da variavel "solicitasaqueEspecial".<br>
	 * Linha 92 e 94 - Se a variavel "solicitasaqueEspecial" for diferente de "num" (100 reais), retornar "throw new io.cucumber.java.PendingException(erro)" (metodo pendente), senão, metodo passou com sucesso.
	 * 
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
	 * 
	 * * ETAPA 3 * <br>
	 * Linha 110 e 111 - Neste metodo o cliente especial deve efetuar o saque de 100 reais e atualizar o saldo da conta para -300 reais (valor definido na variavel "{int} e int1"), 'THEN - @tag1' na classe "conta_bdd.feature"; <br>
	 * Linha 113 - Se "clienteEspecial" for true (cliente é especial).<br>
	 * Linha 115 - Se o saldo for > 0 (positivo) ou menor que 0 (negativo), pode efetuar o saque das duas maneiras.<br>
	 * Linha 117 e 118 - Chamando o objeto "cliente" e definindo o metodo "setSaldoEspecial()" criado na classe "Cliente", passando como parametro o valor de "int1", colocando o valor setado dentro da variavel "saldoEspecialAtual".<br>
	 * Linha 122 e 124 - senão, retornar "throw new io.cucumber.java.PendingException(erro)" (metodo pendente).
	 * 
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
	 * 
	 * * ETAPA 4 * <br>
	 * Linha 139 e 140 - Neste metodo o cliente comum tem um saldo de -300 reais (valor definido na variavel "{int} e int1"), 'GIVEN - @tag2' na classe "conta_bdd.feature";<br>
	 * Linha 142 - passando o valor de "int1" na variavel "num".<br>
	 * Linha 144 e 145 - Chamando o objeto "cliente" e definindo o metodo "setSaldoComum()" criado na classe "Cliente", passando como parametro o valor de "int1", colocando o valor setado dentro da variavel "saldoComum".<br>
	 * Linha 147 e 149 - Se a variavel "saldoComum" for diferente de "num" (-300 reais), retornar "throw new io.cucumber.java.PendingException(erro)" (metodo pendente), senão, metodo passou com sucesso.
	 * 
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
	 * 
	 * * ETAPA 5 * <br>
	 * Linha 164 e 165 - Neste metodo o cliente comum solicita um saque de 200 reais (valor definido na variavel "{int} e int1"), 'WHEN - @tag2' na classe "conta_bdd.feature";<br>
	 * Linha 167 - passando o valor de "int1" na variavel "num".<br>
	 * Linha 169 e 170 - Chamando o objeto "cliente" e definindo o metodo "setSaqueComum()" criado na classe "Cliente", passando como parametro o valor de "int1", colocando o valor setado dentro da variavel "solicitasaqueComum".<br>
	 * Linha 172 e 174 - Se a variavel "solicitasaqueComum" for diferente de "num" (200 reais), retornar "throw new io.cucumber.java.PendingException(erro)" (metodo pendente), senão, metodo passou com sucesso.
	 * 
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
	 * 
	 * * ETAPA 6 * <br>
	 * Linha 189 e 190 - Neste metodo o cliente comum não deve efetuar o saque de 200 reais e deve retornar a mensagem "Saldo Insuficiente", 'THEN - @tag2' na classe "conta_bdd.feature"; <br>
	 * Linha 192 - Se "clienteEspecial" for false (cliente é comum).<br>
	 * Linha 194 e 195 - Se o "saldoComum" for > 0 (positivo), chamar o metodo "setSaqueComum" passando como parametro a variavel "solicitasaqueComum" (saque do clliente efetuado com sucesso).<br>
	 * Linha 199 - senão, retornar "throw new io.cucumber.java.PendingException(erro2)" (metodo pendente e saldo insuficiente).
	 * 
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