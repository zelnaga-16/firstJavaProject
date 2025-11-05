package com.example.helloworld;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalcTax {
    public static void main(String[] args) {
        double net = 9.99;
        double VAT = 0.23;
        double tax = net + net * VAT;
        System.out.printf("Price without VAT:"+ net +"\n");
        System.out.printf("Price with VAT:"+ tax+"\n");
        System.out.printf("Value without VAT:"+ net*10_000+"\n");
        System.out.printf("Value with VAT:"+ tax*10_000+"\n\n");

        BigDecimal net2 = BigDecimal.valueOf(net);
        BigDecimal VAT2 = BigDecimal.valueOf(VAT);
        BigDecimal tax2 = net2.add(net2.multiply(VAT2));
        BigDecimal thousand10 = BigDecimal.valueOf(10000.0);
        System.out.printf("Price without VAT:%.2f \n",net2);
        System.out.printf("Price with VAT: %.2f \n", tax2);
        System.out.printf("Value without VAT: %.2f \n", net2.multiply(thousand10));
        System.out.printf("Value with VAT:%.2f \n", tax2.multiply(thousand10));

    }
}
