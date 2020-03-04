/**
 * MyException.java 
 * @author Charles Tianchen Yu 
 *
 * This file is a solution file. 
 */

public class MyException extends Throwable
{
    protected String from;

    public MyException(String from, String message)
    {
        super(message);
        this.from = from;
    }

    public String toString()
    {
        return String.format("Exception from %s caused by %s. ", from, getMessage());
    }
}