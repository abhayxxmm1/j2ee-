package co.vinod.mode.d2;

public class QueueException extends RuntimeException {

	private static final long serialVersionUID = -4922757735367445482L;
	
	public QueueException() {
		super("Something went wrong while working with the queue");
	}

	public QueueException(String message) {
		super(message);
	}

	public QueueException(Throwable cause) {
		super(cause);
	}

}
