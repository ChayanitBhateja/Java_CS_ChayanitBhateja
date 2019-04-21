package com;

public class InvalidSlotException extends Exception {

    
	private static final long serialVersionUID = 1L;

	public InvalidSlotException() {
    }

    public InvalidSlotException(String msg) {
        super(msg);
    }
}
