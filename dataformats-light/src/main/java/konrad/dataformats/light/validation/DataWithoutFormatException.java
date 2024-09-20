package konrad.dataformats.light.validation;

public class DataWithoutFormatException extends RuntimeException {
    public DataWithoutFormatException(String message) {
        super(message);
    }

    public DataWithoutFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}
