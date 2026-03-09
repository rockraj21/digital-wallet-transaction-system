package com.wallet.walletlog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wallet.walletlog.model.Transaction;
import com.wallet.walletlog.repository.TransactionRepository;

@Service
public class TransactionService {

    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository){
        this.repository = repository;
    }

    public String save(Transaction transaction){

        if(transaction.getAmount() <= 0){
            return "Amount must be positive";
        }

        double balance = getBalance(transaction.getWalletId());

        if(transaction.getTransactionType().equals("Debit")
                && transaction.getAmount() > balance){
            return "Debit exceeds wallet balance";
        }

        repository.save(transaction);

        return "success";
    }

    public List<Transaction> getAllTransactions(){

        List<Transaction> list = repository.findAll();

        double balance = 0;

        for(Transaction t : list){

            if(t.getTransactionType().equals("Credit")){
                balance += t.getAmount();
            }else{
                balance -= t.getAmount();
            }

            t.setBalance(balance);
        }

        return list;
    }

    public double getBalance(String walletId){

        double balance = 0;

        List<Transaction> list = repository.findAll();

        for(Transaction t : list){

            if(t.getWalletId().equals(walletId)){

                if(t.getTransactionType().equals("Credit")){
                    balance += t.getAmount();
                }else{
                    balance -= t.getAmount();
                }

            }
        }

        return balance;
    }
}