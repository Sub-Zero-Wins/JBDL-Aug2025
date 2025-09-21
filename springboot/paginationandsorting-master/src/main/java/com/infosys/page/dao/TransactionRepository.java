package com.infosys.page.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.infosys.page.Transaction;


public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Integer> {

	public List<Transaction> findByTransactionDateAfter(LocalDate date,PageRequest pageRequest);
	public List<Transaction> findByTransactionDateBefore(LocalDate date,PageRequest pageRequest);
}
