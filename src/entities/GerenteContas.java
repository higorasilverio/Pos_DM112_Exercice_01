package entities;

import java.util.HashMap;

import entities.exceptions.SaldoInsuficienteException;
import entities.interfaces.Atualizacao;

public class GerenteContas {
	
	private HashMap<Integer, Atualizacao> contas = new HashMap<Integer, Atualizacao>();
	
	public void atualizarTodasContas() {
		for (Atualizacao obj : contas.values()) {
			try {
				obj.atualizarSaldo();
			} catch (SaldoInsuficienteException e) {
				System.out.println("A conta " + obj.getNumero() + " não tem saldo para atualização.");
			}
		}
	}
	public void adicionar(Atualizacao a) {
		this.contas.put(a.getNumero(), a);
	}
	public void removerConta(int numero) {
		this.contas.remove(numero);
	}
}
