package banco;

public class Conta {

	private double saldo;

	public void deposita(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
	public void saca(double valor) {
		this.setSaldo(this.getSaldo() - valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
