package com.dondon.simplebanking.service;

import com.dondon.simplebanking.helper.AccountFactory;
import com.dondon.simplebanking.model.Account;
import com.dondon.simplebanking.repository.AccountRepository;
import com.dondon.simplebanking.request.RequestCreateAccount;
import com.dondon.simplebanking.request.RequestTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService{

    @Autowired
    private AccountRepository repository;

    @Override
    public Account createAccount(RequestCreateAccount account) {
        Account createAccount = AccountFactory.createAccount(account.getName(), account.getType());
        return repository.save(createAccount);
    }

    @Override
    public Account getAccount(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Account> getAllAccount() {
        return repository.findAll();
    }

    @Override
    public Account transaction(Long id, RequestTransaction transaction) {
        Account account = getAccount(id);
        double amount = transaction.getAmount();
        Double balance = switch (transaction.getType()) {
            case "withdraw" -> account.getBalance() - amount;
            case "deposit" -> account.getBalance() + amount;
            default -> null;
        };
        account.setBalance(transactionProcessValue(balance, account));
        return repository.save(account);
    }

    @Override
    public void deleteAccount(Long id) {
        repository.deleteById(id);
    }

    private Double transactionProcessValue(double balance, Account account) {
        double minimumBalance = account.getMinimumBalance();
        double transactionCharge = account.getTransactionCharge();
        double penaltyCharge = account.getPenalty();
        return (balance < minimumBalance ? balance - penaltyCharge : balance) - transactionCharge;
    }
}
