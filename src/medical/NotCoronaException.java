package medical;

public class NotCoronaException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public NotCoronaException() {}
	
	public NotCoronaException(String msg) {
		super(msg);
	}
}
