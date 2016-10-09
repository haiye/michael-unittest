package haimin.ye.paypal.michael.db.exception;


public class FinderException extends Exception{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public FinderException() {
        super();
    }

    /**
     * @param stringMessage
     */
    public FinderException(String stringMessage) {
        super(stringMessage);
    }

    /**
     * @param stringMessage
     * @param cause
     */
    public FinderException(String stringMessage, Throwable cause) {
        super(stringMessage, cause);
    }

}
