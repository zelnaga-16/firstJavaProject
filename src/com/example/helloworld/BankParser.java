package com.example.helloworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class BankParser {
    URL url = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");

    public void PafseFor(String str)
    {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String infoLine = "";
            while((infoLine = br.readLine()) != null)
            {
                String[] keys = infoLine.split("\t");
                if(keys[0].trim().equals(str.trim()))
                {
                    System.out.println("Number: "+keys[0].trim()+"\nName: "+keys[1].trim());
                    break;
                }
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public BankParser() throws MalformedURLException {
    }
}
