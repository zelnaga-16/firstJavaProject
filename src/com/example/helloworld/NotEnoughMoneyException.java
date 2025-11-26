package com.example.helloworld;

public class NotEnoughMoneyException extends RuntimeException
{
    public NotEnoughMoneyException()
    {
        super("Not enough money in your account");
    }
}
