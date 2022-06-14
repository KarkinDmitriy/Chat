package ru.gb.core2.chat.chatserver.error;



public class WrongCredentialsException extends IllegalArgumentException {
    public WrongCredentialsException() {
    }

    public WrongCredentialsException(String s) {
        super(s);
    }
}
