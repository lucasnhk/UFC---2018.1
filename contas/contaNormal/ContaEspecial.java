package Limbus.contas.contaNormal;

public class ContaEspecial extends Conta {
	
	private double bonus;
	private double taxa;

	public ContaEspecial(String numero) {
		super(numero);
		this.bonus = 0.0;
		this.taxa = 0.01;
	}
	
	public void creditar(double valor) {
		super.creditar(valor);
		this.bonus += (valor * taxa);
	}

	public void renderBonus(String numero) {
		super.creditar(bonus);
		this.bonus = 0.0;
	}
}