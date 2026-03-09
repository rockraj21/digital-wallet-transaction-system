package com.wallet.walletlog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.wallet.walletlog.model.Transaction;
import com.wallet.walletlog.service.TransactionService;

@Controller
public class TransactionController {

    private final TransactionService service;

    public TransactionController(TransactionService service){
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model){

        model.addAttribute("transaction", new Transaction());
        model.addAttribute("transactions", service.getAllTransactions());

        return "index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Transaction transaction, Model model){

        String result = service.save(transaction);

        model.addAttribute("transactions", service.getAllTransactions());
        model.addAttribute("transaction", new Transaction());

        if(!result.equals("success")){
            model.addAttribute("error", result);
        }

        return "index";
    }
}

