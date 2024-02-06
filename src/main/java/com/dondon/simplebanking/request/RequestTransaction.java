package com.dondon.simplebanking.request;

public class RequestTransaction {

    private String type;

    private Double amount;

    public RequestTransaction(String type, Double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public Double getAmount() {
        return amount;
    }
}
