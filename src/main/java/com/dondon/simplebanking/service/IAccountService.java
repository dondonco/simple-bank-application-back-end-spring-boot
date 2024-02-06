package com.dondon.simplebanking.service;

import com.dondon.simplebanking.model.Account;
import com.dondon.simplebanking.request.RequestCreateAccount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IAccountService {

    Account createAccount(RequestCreateAccount account);

    Account getAccount(Long id);

    List<Account> getAllAccount();

    void transaction();

    void deleteAccount(Long id);
}
