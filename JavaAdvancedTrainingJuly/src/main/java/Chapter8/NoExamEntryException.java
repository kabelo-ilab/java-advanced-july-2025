package Chapter8;

/**
 * Thrown to indicate that a student doesn't have an exam entry
 */
public class NoExamEntryException extends Exception{
    /**
     * Constructs an {@code NoExamEntryException} exception with a detailed message
     * @param message detailed message
     */
    public NoExamEntryException(String message){
        super(message);
    }

}
