package entities;

public class ContaPoupanca extends Conta{

	private float taxaDeJuros;
		
	public ContaPoupanca(int numero, String cliente, float taxaDeJuros) {
		super(numero, cliente);
		this.taxaDeJuros = taxaDeJuros;
	}
	
	@Override
	public void atualizarSaldo() {
		super.depositar(this.getSaldo() * this.taxaDeJuros/100);
	}

}
