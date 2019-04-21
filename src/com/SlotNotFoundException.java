package com;

public class SlotNotFoundException extends Exception {

   
	private static final long serialVersionUID = 1L;

	public SlotNotFoundException() {
    }

    public SlotNotFoundException(String msg) {
        super(msg);
    }
}
