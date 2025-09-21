package com.infosys.page;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction 
{
	@Id
	private Integer transactionId;
	private LocalDate transactionDate;
	private Float  transactionAmount;
	@Override
	public int hashCode() {
		return Objects.hash(transactionAmount, transactionDate, transactionId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Objects.equals(transactionAmount, other.transactionAmount)
				&& Objects.equals(transactionDate, other.transactionDate)
				&& Objects.equals(transactionId, other.transactionId);
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(Integer transactionId, LocalDate transactionDate, Float transactionAmount) {
		super();
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.transactionAmount = transactionAmount;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", transactionDate=" + transactionDate
				+ ", transactionAmount=" + transactionAmount + "]";
	}
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	public Float getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(Float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

}
