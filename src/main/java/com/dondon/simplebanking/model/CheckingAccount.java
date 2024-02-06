package com.dondon.simplebanking.model;

public class CheckingAccount extends Account {

    private final Double MINIMUM_BALANCE = 100.00;

    private final Double PENALTY_CHARGE = 10.00;

    private final Double TRANSACTION_CHARGE = 1.00;

    public CheckingAccount(String name) {
        super(name);
        this.setBalance(MINIMUM_BALANCE);
        this.setMinimumBalance(MINIMUM_BALANCE);
        this.setPenalty(PENALTY_CHARGE);
        this.setTransactionCharge(TRANSACTION_CHARGE);
    }
}
