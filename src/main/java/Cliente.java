public class Cliente {

	// Cria��o dos atributos que ser�o utilizados.

	private int saldoEspecial;
	private int saqueEspecial;
	private int contaEspecial;

	private int saldoComum;
	private int saqueComum;
	private int contaComum;

	/**
	 * 
	 * - Cria��o do construtor vazio da classe.
	 * 
	 */

	public Cliente() {
		super();
	}
	
	// - Cria��o dos getters e setters dos atributos criados.
	// - Os metodos v�o ser utilizados na classe "Conta" quando instanciados e chamados.

	public int getSaldoEspecial() {
		return saldoEspecial;
	}

	public void setSaldoEspecial(int saldoEspecial) {
		this.saldoEspecial = saldoEspecial;
	}

	public int getSaqueEspecial() {
		return saqueEspecial;
	}

	public void setSaqueEspecial(int saqueEspecial) {
		this.saqueEspecial = saqueEspecial;
	}

	public int getContaEspecial() {
		return contaEspecial;
	}

	public void setContaEspecial(int contaEspecial) {
		this.contaEspecial = contaEspecial;
	}

	public int getSaldoComum() {
		return saldoComum;
	}

	public void setSaldoComum(int saldoComum) {
		this.saldoComum = saldoComum;
	}

	public int getSaqueComum() {
		return saqueComum;
	}

	public void setSaqueComum(int saqueComum) {
		this.saqueComum = saqueComum;
	}

	public int getContaComum() {
		return contaComum;
	}

	public void setContaComum(int contaComum) {
		this.contaComum = contaComum;
	}

}