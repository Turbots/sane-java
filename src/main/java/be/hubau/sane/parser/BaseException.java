package be.hubau.sane.parser;

public abstract class BaseException extends Exception {

    abstract String errorMessage();

    @Override
    public String getMessage() {
        return errorMessage();
    }
}
