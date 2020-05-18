package main.code.days_30.day_17;

public class NegativeParameterException extends RuntimeException {

    public NegativeParameterException(String message) {
        super(message);
    }

    public NegativeParameterException(String message, Throwable cause) {
        super(message, cause);
    }
}
