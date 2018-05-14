package Limbus.contas.contaNormal;

public class ContaNormal extends ContaAbstrata {

	public Conta (String numero){
		super(numero);
	}

	public void debitar(double valor){
		saldo -= valor;
	}
}