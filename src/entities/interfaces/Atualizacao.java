package entities.interfaces;

import entities.exceptions.SaldoInsuficienteException;

public interface Atualizacao {
	
	public void atualizarSaldo() throws SaldoInsuficienteException;
	
	public int getNumero();
	
}
