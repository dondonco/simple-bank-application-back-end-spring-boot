package com.dondon.simplebanking.request;

public class RequestCreateAccount {

    private String name;

    private String type;

    public RequestCreateAccount(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
