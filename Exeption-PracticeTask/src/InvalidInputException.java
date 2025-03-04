import jdk.internal.event.ThrowableTracer;

public class InvalidInputException extends Exception {

    String name;
    InvalidInputException(@org.jetbrains.annotations.NotNull String name) {
        this.name = name;
        if(name.length() < 3) {
            getMessage();
        }
    }

    @Override
    public String getMessage() {
        return "Invalid input";
    }
}
