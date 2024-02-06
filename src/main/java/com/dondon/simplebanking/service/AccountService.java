package com.dondon.simplebanking.service;

import com.dondon.simplebanking.model.Account;
import com.dondon.simplebanking.request.RequestCreateAccount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService{
    @Override
    public Account createAccount(RequestCreateAccount account) {
        return null;
    }

    @Override
    public Account getAccount(Long id) {
        return null;
    }

    @Override
    public List<Account> getAllAccount() {
        return null;
    }

    @Override
    public void transaction() {

    }

    @Override
    public void deleteAccount(Long id) {

    }
}
