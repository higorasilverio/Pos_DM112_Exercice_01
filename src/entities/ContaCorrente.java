package entities;

import entities.exceptions.SaldoInsuficienteException;

public class ContaCorrente extends Conta{
	
	private float manutencaoMensal;
		
	public ContaCorrente(int numero, String cliente, float manutencaoMensal) {
		super(numero, cliente);
		this.manutencaoMensal = manutencaoMensal;
	}
	
	@Override
	public void atualizarSaldo() throws SaldoInsuficienteException{
		super.sacar(manutencaoMensal);
	}

}
