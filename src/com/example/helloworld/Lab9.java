package com.example.helloworld;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class Lab9 {
    public static void main(String[] args) {
        try {
            BankParser parser = new BankParser();
            parser.PafseFor("102");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


    }

    public static void Task13()
    {
        //6
        try{
            Task1PointerExeption();
            System.out.println("hihi");
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
            e.printStackTrace();
        }


        //task 3
        Account acc1 = new Account("owner 1",100,"452852573527");
        Account acc2 = new Account("owner 2",150,"452859423527");

        try
        {
            acc1.TransferMoney(acc2,acc1.getBalance()+50);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
            e.printStackTrace();
        }
        finally {
            System.out.println("acc1 balance: "+acc1.getBalance());
        }

    }

    public static int Task1PointerExeption()
    {
        String name = null;
        return name.length();

    }

    public static void Task4()
    {
        try {
            SortFor5students sorter = new SortFor5students();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}