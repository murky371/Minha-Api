package com.joao.myapi.resources.exceptions;

public class StandardError {
	private Integer status;
	private long timestamp;
	private String message;

	public StandardError() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StandardError(Integer status, long timestamp, String message) {
		super();
		this.status = status;
		this.timestamp = timestamp;
		this.message = message;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
