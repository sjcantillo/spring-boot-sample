/**
 * 
 */
package com.sadr.model;

/**
 * @author silvio.cantillo
 *
 */
public class PingRequest {
	private long id;
	private String message;

	public PingRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PingRequest(long id, String message) {
		this.id = id;
		this.message = message;
	}


	public long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "id: " + String.valueOf(id) + " message: " + message;
	}
}
