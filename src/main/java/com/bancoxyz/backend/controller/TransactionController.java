package com.bancoxyz.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancoxyz.backend.model.dto.TransactionResponse;
import com.bancoxyz.backend.service.TransactionService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

  private TransactionService transactionService;

  public TransactionController(TransactionService transactionService) {
    this.transactionService = transactionService;
   }

  @GetMapping()
  public ResponseEntity<List<TransactionResponse>> getAllTransactions(){
    return ResponseEntity.ok(transactionService.findAllTransactions());
  }
 
}
