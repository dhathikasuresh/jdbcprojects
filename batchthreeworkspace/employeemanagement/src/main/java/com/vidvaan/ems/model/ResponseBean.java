package com.vidvaan.ems.model;

public class ResponseBean {
	private int status;
	private String msg;

	public ResponseBean(int status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}

	public ResponseBean() {
		super();
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "ResponseBean [status=" + status + ", msg=" + msg + "]";
	}
}
