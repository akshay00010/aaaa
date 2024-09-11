package com.neoteric.project.model;

import lombok.Builder;

import java.util.Date;
@Builder
public class Atm {
    private String cardNumber;
    private String pin;
    private String accountNumber;
    private String cvv;
    private Date cardExpiry;
}

