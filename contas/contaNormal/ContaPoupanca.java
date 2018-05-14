package Limbus.contas.contaNormal;

public class ContaPoupanca extends ContaNormal {

	public ContaPoupanca(String numero){ 
		super(numero);
	} 

	public void renderJuros(double taxa){
		super.creditar(super.getSaldo() * taxa);
  	}
}
