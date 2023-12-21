package org.example.exceptions;


// exception surveillée
public class MyException extends Exception {
    
    public MyException(String message) {
        super(message);
    }
}


//exception non surveillée

public class SecondException extends RuntimeException {
    
    public SecondException(String message) {
        super(message);
    }
}