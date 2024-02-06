package com.dondon.simplebanking.model;

import jakarta.persistence.Entity;

@Entity
public class RegularAccount extends Account {

    public RegularAccount() {}

    public RegularAccount(String name) {
        super(name);
        this.setBalance(500.00);
        this.setMinimumBalance(500.00);
        this.setPenalty(10.00);
    }
}
