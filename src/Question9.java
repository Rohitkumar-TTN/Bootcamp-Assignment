class NoStackTraceException extends Exception {
    public NoStackTraceException(String message) {
        super(message);
    }
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}



public class Question9 {
    public static void main(String[] args) {
        try {
            throw new NoStackTraceException("This is a custom exception without stack trace.");
        } catch (NoStackTraceException e) {
            e.printStackTrace(); // Prints only the exception message
        }
    }
}

