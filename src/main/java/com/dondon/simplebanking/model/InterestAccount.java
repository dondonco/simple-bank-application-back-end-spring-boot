package com.dondon.simplebanking.model;

import jakarta.persistence.Entity;

@Entity
public class InterestAccount extends Account {

    public InterestAccount() {}


    public InterestAccount(String name) {
        super(name);
        this.setInterestCharge(0.03);
    }
}
