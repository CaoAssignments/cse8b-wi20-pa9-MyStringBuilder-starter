/**
 * MSBOutOfBoundsException.java
 *
 * @author Charles Tianchen Yu
 * <p>
 * This file is a solution file.
 */

public class MSBOutOfBoundsException extends MyException {

    public MSBOutOfBoundsException(String from, String message) {
        super(from, message);
    }

    public String toString() {
        return String.format("MSBOutOfBounds%s", super.toString());
    }
}