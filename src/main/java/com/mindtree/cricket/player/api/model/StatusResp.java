package com.mindtree.cricket.player.api.model;

import io.swagger.annotations.ApiModelProperty;

public class StatusResp {
	@ApiModelProperty(notes="response status type",example="SUCCESS",dataType="string")
	private String status;
	@ApiModelProperty(notes="status message",example="Invalid Username and Password")
	private String message;
	@ApiModelProperty(name="employee data")
	private Player[] data;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Player[] getData() {
		return data;
	}

	public void setData(Player[] data) {
		this.data = data;
	}

}
