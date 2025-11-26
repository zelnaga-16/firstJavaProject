package com.example.helloworld;

public class Account {
    private String owner;
    private int balance;
    private String accountNumber;

    public Account(String owner, int balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void TransferMoney(Account recepient,int amount) {
        if(this.balance < amount)
        {
            throw new NotEnoughMoneyException();
        }
        else
        {
            this.balance -= amount;
            recepient.setBalance(recepient.getBalance()+amount);
        }
    }

}
