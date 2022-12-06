package com.gearbest.exception;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorDetails {

	private LocalDateTime dateAndTime;

	private String message;

	private String desc;

	public LocalDateTime getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(LocalDateTime dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
