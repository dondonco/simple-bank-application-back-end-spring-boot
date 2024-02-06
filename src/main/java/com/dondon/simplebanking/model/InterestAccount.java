package com.dondon.simplebanking.model;

public class InterestAccount extends Account {

    private final Double INTEREST_CHARGE = 3.0;

    public InterestAccount(String name) {
        super(name);
        this.setInterestCharge(INTEREST_CHARGE);
    }
}
