package com.neoteric.project.exception;

public class AccountCreationFailedException extends Exception{
    public String messae;

    public AccountCreationFailedException(String ms){
        this.messae=ms;
    }

}


