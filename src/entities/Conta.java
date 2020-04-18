package entities;

import entities.exceptions.SaldoInsuficienteException;
import entities.interfaces.Atualizacao;

public abstract class Conta implements Atualizacao{
	
	private int numero;
	private String cliente;
	private float saldo = 0f;
	
	public Conta(int numero, String cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}
	@Override
	public int getNumero() {
		return numero;
	}
	public float getSaldo() {
		return saldo;
	}
	public void sacar(float valor) throws SaldoInsuficienteException{
		this.saldo -= valor;
	}
	public void depositar(float valor) {
		this.saldo += valor;
	}
	public void transferirPara(Conta c, float valor) throws SaldoInsuficienteException{
		this.sacar(valor);
		c.depositar(valor);
	}

}
