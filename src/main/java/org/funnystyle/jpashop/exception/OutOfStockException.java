package org.funnystyle.jpashop.exception;

public class OutOfStockException extends RuntimeException {

    public OutOfStockException(String message) {
        super(message);
    }
}
