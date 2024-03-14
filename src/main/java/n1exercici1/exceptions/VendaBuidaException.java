package n1exercici1.exceptions;

public class VendaBuidaException extends Exception{

	private static final long serialVersionUID = 1L;
	
	private String message = "";
	
	public VendaBuidaException(String message) {
		super(message);
	
	}

	public String getMessage() {
		return message;
	}

}
