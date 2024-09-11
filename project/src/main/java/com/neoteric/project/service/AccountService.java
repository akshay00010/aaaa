package com.neoteric.project.service;

import com.neoteric.project.exception.AccountCreationFailedException;
import com.neoteric.project.model.Account;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class AccountService {
    public String createAccount(Account account) throws AccountCreationFailedException {
        String accountNumber=null;
        try{
            Connection connection = DBConnection.getConnection();
            Statement stmt = connection.createStatement();
            accountNumber = UUID.randomUUID().toString();
//            insert into bank.account values('123456','chandra','52364','9898562315',20000.0);
            String query = "insert into bank.account values('"+
                    accountNumber+"'"+","+

                    "'"+account.getName()+"'"+","+
                    "'"+account.getPan()+"'"+","+
                    "'"+account.getMobile()+"'"+","
                    + account.getBalance()+")";
            int status = stmt.executeUpdate(query);

            if (status==1){
                System.out.println("Account is created "+accountNumber);
            }else{
                throw new AccountCreationFailedException("Account creation is failed"+account.getPan());
            }

        }catch ( SQLException e){
            System.out.println("Exception occurred in sql"+e);

        }catch (AccountCreationFailedException e){
            System.out.println("Exception occured"+e);
            throw e;
        }
        return accountNumber;
    }
}


