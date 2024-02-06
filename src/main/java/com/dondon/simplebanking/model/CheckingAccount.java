package com.dondon.simplebanking.model;

import jakarta.persistence.Entity;

@Entity
public class CheckingAccount extends Account {

    public CheckingAccount() {}

    public CheckingAccount(String name) {
        super(name);
        this.setBalance(100.00);
        this.setMinimumBalance(100.00);
        this.setPenalty(10.00);
        this.setTransactionCharge(1.00);
    }
}
