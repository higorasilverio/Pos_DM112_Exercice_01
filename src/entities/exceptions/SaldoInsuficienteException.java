package entities.exceptions;

public class SaldoInsuficienteException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public SaldoInsuficienteException(String m) {
		super(m);
	}

}
