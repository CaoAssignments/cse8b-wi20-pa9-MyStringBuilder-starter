/**
 * BadInputException.java
 *
 * @author Charles Tianchen Yu
 * <p>
 * This file is a solution file.
 */

public class BadInputException extends MyException {
    public BadInputException(String from, String message) {
        super(from, message);
    }

    public String toString() {
        return String.format("BadInput%s", super.toString());
    }
}