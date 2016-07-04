package banco;

public class ContaCorrente extends Conta {
	public void atualiza(double taxa) {
		this.setSaldo(this.getSaldo() + this.getSaldo() * taxa * 2);
	}
	
	public void deposita(double valor) {
		this.setSaldo(this.getSaldo() + (valor - 0.10));
	}
}
