package com.dondon.simplebanking.controller;

import com.dondon.simplebanking.model.Account;
import com.dondon.simplebanking.request.RequestCreateAccount;
import com.dondon.simplebanking.request.RequestTransaction;
import com.dondon.simplebanking.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("")
    public ResponseEntity<Account> createAccount(@RequestBody RequestCreateAccount account) {
        return new ResponseEntity<>(accountService.createAccount(account), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable Long id) {
        return new ResponseEntity<>(accountService.getAccount(id), HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<List<Account>> getAllAccount() {
        return new ResponseEntity<>(accountService.getAllAccount(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccountById(@PathVariable Long id) {
        accountService.deleteAccount(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/{id}/transactions")
    public ResponseEntity<Account> transaction(@PathVariable Long id, @RequestBody RequestTransaction transaction) {
        return new ResponseEntity<>(accountService.transaction(id, transaction), HttpStatus.OK);
    }
}
