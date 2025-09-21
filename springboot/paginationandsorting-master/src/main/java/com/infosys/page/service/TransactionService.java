package com.infosys.page.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.infosys.page.Transaction;
import com.infosys.page.dao.TransactionRepository;



@Service
public class TransactionService 
{
   @Autowired
   TransactionRepository repo;
   
	public List<Transaction> getAllTransactions(int pageNo,int pageSize,Sort sort)
	{
		PageRequest pageRequest=PageRequest.of(pageNo, pageSize,sort);
		Page<Transaction> page=repo.findAll(pageRequest);
		List<Transaction> listTransaction=page.getContent();
		return listTransaction;
	}
	public List<Transaction> getAllTransactionsAfterDate(LocalDate date,int pageNo,int pageSize)
	{
		PageRequest pageRequest=PageRequest.of(pageNo, pageSize);
		List<Transaction> listTransaction=repo.findByTransactionDateAfter(date, pageRequest);
		return listTransaction;
	}
	public List<Transaction> getAllTransactionsBeforeDate(LocalDate date,int pageNo,int pageSize)
	{
		PageRequest pageRequest=PageRequest.of(pageNo, pageSize);
		List<Transaction> listTransaction=repo.findByTransactionDateBefore(date, pageRequest);
		return listTransaction;
	}
	
	public List<Transaction> getAllTransactionsSorted()
	{
		
		Sort sort= Sort.by("transactionDate").descending();
		Iterable<Transaction> itr=repo.findAll(sort);		
		return (List<Transaction>)itr;
	}
	
	public List<Transaction> getAllTransactionsSortedByDateAndAmount()
	{
		
		Sort sort= Sort.by("transactionDate").and(Sort.by("transactionAmount").descending());
		Iterable<Transaction> itr=repo.findAll(sort);		
		return (List<Transaction>)itr;
	}
	
	
	
	
	
	
	
	
	
	
	
}
