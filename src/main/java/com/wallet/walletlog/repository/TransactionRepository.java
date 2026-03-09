package com.wallet.walletlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wallet.walletlog.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}