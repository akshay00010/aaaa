package com.neoteric.project.controller;


import com.neoteric.project.exception.AccountCreationFailedException;
import com.neoteric.project.model.Account;
import com.neoteric.project.service.AccountService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("http://localhost:4200/")
@RestController
public class AccountController {

    @PostMapping(value = "/api/createAccount",consumes = "application/json",produces = "application/json")

    public Account getAccountNumber(@RequestBody Account account) throws AccountCreationFailedException {
        AccountService accountService = new AccountService();
        String accountNumber= accountService.createAccount(account);
        account.setAccountNumber(accountNumber);
        return account;
    }
}