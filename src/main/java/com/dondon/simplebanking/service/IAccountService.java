package com.dondon.simplebanking.service;

import com.dondon.simplebanking.model.Account;
import com.dondon.simplebanking.request.RequestCreateAccount;
import com.dondon.simplebanking.request.RequestTransaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IAccountService {

    Account createAccount(RequestCreateAccount account);

    Account getAccount(Long id);

    List<Account> getAllAccount();

    Account transaction(Long id, RequestTransaction transaction);

    void deleteAccount(Long id);
}
