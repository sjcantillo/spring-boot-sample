/**
 * 
 */
package com.sadr.model;

/**
 * @author silvio.cantillo
 *
 */
public class PingResponse {

	private String responseMessage;

	public PingResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PingResponse(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	@Override
	public String toString() {
		return " message: " + responseMessage;
	}
}
