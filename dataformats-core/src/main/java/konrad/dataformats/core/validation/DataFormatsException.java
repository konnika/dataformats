package konrad.dataformats.core.validation;

public class DataFormatsException extends RuntimeException {
    public DataFormatsException(String message) {
        super(message);
    }

    public DataFormatsException(String message, Throwable cause) {
        super(message, cause);
    }
}
