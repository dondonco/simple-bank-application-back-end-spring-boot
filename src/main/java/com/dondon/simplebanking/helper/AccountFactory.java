package com.dondon.simplebanking.helper;

import com.dondon.simplebanking.model.Account;
import com.dondon.simplebanking.model.CheckingAccount;
import com.dondon.simplebanking.model.InterestAccount;
import com.dondon.simplebanking.model.RegularAccount;

public class AccountFactory {

    public static Account createAccount(String name, String type) {
        return switch (type) {
            case "regular" -> new RegularAccount(name);
            case "checking" -> new CheckingAccount(name);
            case "interest" -> new InterestAccount(name);
            default -> null;
        };
    }
}
