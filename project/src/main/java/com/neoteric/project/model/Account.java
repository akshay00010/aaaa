package com.neoteric.project.model;

import lombok.Builder;
import lombok.Data;


    @Builder
    @Data
    public class Account {
        private String name;
        private String accountNumber;
        private String pan;
        private String mobile;
        private double balance;
    }

