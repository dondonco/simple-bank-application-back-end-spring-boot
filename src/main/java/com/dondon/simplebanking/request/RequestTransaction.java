package com.dondon.simplebanking.request;

public class RequestTransaction {

    private String transaction;

    private Double amount;

    public RequestTransaction(String transaction, Double amount) {
        this.transaction = transaction;
        this.amount = amount;
    }

    public String getTransaction() {
        return transaction;
    }

    public Double getAmount() {
        return amount;
    }
}
