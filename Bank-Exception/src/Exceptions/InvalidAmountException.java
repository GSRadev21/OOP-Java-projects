package Exceptions;

public class InvalidAmountException extends RuntimeException {

    public InvalidAmountException() {

        super("Your balance is not enough!");
    }
}
