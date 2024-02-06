package com.dondon.simplebanking.model;

public class RegularAccount extends Account {

    private final Double MINIMUM_BALANCE = 500.00;
    private final Double PENALTY_CHARGE = 10.00;
    public RegularAccount(String name) {
        super(name);
        this.setBalance(MINIMUM_BALANCE);
        this.setMinimumBalance(MINIMUM_BALANCE);
        this.setPenalty(PENALTY_CHARGE);
    }
}
