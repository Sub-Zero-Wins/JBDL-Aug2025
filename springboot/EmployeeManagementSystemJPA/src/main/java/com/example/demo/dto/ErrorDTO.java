package com.example.demo.dto;

import java.sql.Date;
import java.time.LocalDate;

public class ErrorDTO
{
	String messageString;
	LocalDate date;
	public ErrorDTO(String messageString, LocalDate date) {
		super();
		this.messageString = messageString;
		this.date = date;
	}
	public String getMessageString() {
		return messageString;
	}
	public void setMessageString(String messageString) {
		this.messageString = messageString;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	

}
