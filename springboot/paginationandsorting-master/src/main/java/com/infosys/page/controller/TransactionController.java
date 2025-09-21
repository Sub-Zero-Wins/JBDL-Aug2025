package com.infosys.page.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.page.Transaction;
import com.infosys.page.service.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
	
	
//	 1. Get all transactions with pagination and sorting
//	 curl "http://localhost:8080/transactions?pageNo=0&pageSize=10&sortBy=transactionAmount&sortDir=desc"
//
//	 
//
//	 📅 2. Get transactions after a specific date
//	 curl "http://localhost:8080/transactions/after?date=2023-10-01&pageNo=0&pageSize=5"
//
//	 
//
//	 📅 3. Get transactions before a specific date
//	 curl "http://localhost:8080/transactions/before?date=2023-09-01&pageNo=0&pageSize=5"
//
//	 
//
//	 📊 4. Get all transactions sorted by transactionDate descending
//	 curl "http://localhost:8080/transactions/sorted/date"
//
//
//
//	 📊 5. Get all transactions sorted by transactionDate ascending and transactionAmount descending
//	 curl "http://localhost:8080/transactions/sorted/date-amount"

    @Autowired
    private TransactionService transactionService;

    // Get all transactions with pagination and sorting
    @GetMapping
    public List<Transaction> getAllTransactions(
            @RequestParam(defaultValue = "0") int pageNo,
            @RequestParam(defaultValue = "10") int pageSize,
            @RequestParam(defaultValue = "transactionDate") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDir) {

        Sort sort = sortDir.equalsIgnoreCase("desc") ?Sort.by(sortBy).descending() : Sort.by(sortBy).ascending();

        return transactionService.getAllTransactions(pageNo, pageSize, sort);
    }

    // Get transactions after a specific date with pagination
    @GetMapping("/after")
    public List<Transaction> getTransactionsAfterDate(
            @RequestParam LocalDate date,
            @RequestParam(defaultValue = "0") int pageNo,
            @RequestParam(defaultValue = "10") int pageSize) {

        return transactionService.getAllTransactionsAfterDate(date, pageNo, pageSize);
    }

    // Get transactions before a specific date with pagination
    @GetMapping("/before")
    public List<Transaction> getTransactionsBeforeDate(
            @RequestParam LocalDate date,
            @RequestParam(defaultValue = "0") int pageNo,
            @RequestParam(defaultValue = "10") int pageSize) {

        return transactionService.getAllTransactionsBeforeDate(date, pageNo, pageSize);
    }

    // Get all transactions sorted by transactionDate descending
    @GetMapping("/sorted/date")
    public List<Transaction> getAllTransactionsSortedByDate() {
        return transactionService.getAllTransactionsSorted();
    }

    // Get all transactions sorted by transactionDate ascending and transactionAmount descending
    @GetMapping("/sorted/date-amount")
    public List<Transaction> getAllTransactionsSortedByDateAndAmount() {
        return transactionService.getAllTransactionsSortedByDateAndAmount();
    }
}