package com.microservice.service.models;

public class ResponseObj {
	public ResponseObj(String msg) {
		super();
		this.msg = msg;
	}

	private String msg;

	public ResponseObj() {
	}

	public String getMsgString() {
		return msg;
	}

	public void setMsgString(String msg) {
		this.msg = msg;
	}

}
