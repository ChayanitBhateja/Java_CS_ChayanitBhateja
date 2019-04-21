/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author Bateja
 */
public class InvalidVehicleException extends Exception {

   
	private static final long serialVersionUID = 1L;

	/**
     * Creates a new instance of <code>InvalidVehicleException</code> without
     * detail message.
     */
    public InvalidVehicleException() {
    }

    /**
     * Constructs an instance of <code>InvalidVehicleException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidVehicleException(String msg) {
        super(msg);
    }
}
