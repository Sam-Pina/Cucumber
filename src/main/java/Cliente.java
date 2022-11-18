public class Cliente {

	// atributos
	private int saldoEspecial;
	private int saqueEspecial;
	private int contaEspecial;

	private int saldoComum;
	private int saqueComum;
	private int contaComum;

	// Contrutor
	public Cliente() {
		super();
	}
	
	// getters e setters
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
