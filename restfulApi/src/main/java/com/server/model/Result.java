package com.server.model;

public class Result {
	private String result;
	private int code;
	private String message;
	public Result() {
		// TODO Auto-generated constructor stub
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Result(String result, int code, String message) {
		super();
		this.result = result;
		this.code = code;
		this.message = message;
	}
	
}
