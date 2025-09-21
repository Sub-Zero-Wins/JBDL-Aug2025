package com.infosys.page;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort;

import com.infosys.page.service.TransactionService;

@SpringBootApplication
public class PaginationSortingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PaginationSortingApplication.class, args);
	}

	@Autowired
	TransactionService service;
	@Override
	public void run(String... args) throws Exception {
		
//		Sort sort=Sort.by("transactionAmount").descending();
//	List<Transaction> listTransaction=service.getAllTransactions(1,10,sort);		
//	listTransaction.forEach(System.out::print);
//		
//		LocalDate date=LocalDate.of(1999, 02, 5);
//		List<Transaction> listTransaction=service.getAllTransactionsBeforeDate(date,0,5);
//		listTransaction.forEach(System.out::print);

	//	service.getAllTransactionsSorted().forEach(System.out::print);
	//	service.getAllTransactionsSortedByDateAndAmount().forEach(System.out::print);
		
		
	}

}
