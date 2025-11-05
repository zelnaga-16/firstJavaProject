package com.example.helloworld;

import java.math.BigDecimal;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        //3
        //Task3();
        //5
        Task5();

    }
    public static void Task3()
    {

        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        double x1;
        double x2;

        double Dis = Math.pow(b*b - 4*a*c, 1.0 / 2);

        int rootCalc = 0;
        if(Dis<0)
        {
            rootCalc = -1;
        }
        else if(Dis>0)
        {
            rootCalc = 1;
        }

        System.out.printf("a:%.2f; b: %.2f; c:%.2f \n", a,b,c);
        switch(rootCalc)
        {
            case -1:
                System.out.println("because discriminant is less than zero roots are non-existant");
                break;
            case 0:
                x1 = ((-1*b)+Dis)/(a*2);
                System.out.printf("x1: %.2f\n", x1);
                break;
            case 1:
                x1 = ((-1*b)+Dis)/(a*2);
                x2 = ((-1*b)-Dis)/(a*2);
                System.out.printf("x1: %.2f; x2: %.2f\n",x1, x2);
                break;
        }
    }
    public static void Task5()
    {
        int selectNum;
        int minNum = 101;
        int MaxNum = -1;
        int count = 10;

        while(count-- > 0)
        {
            selectNum = (int) Math.floor(Math.random()*101);
            System.out.printf("%d generated number: %d\n",count+1, selectNum);
            if(selectNum < minNum)
            {
                minNum = selectNum;
            }
            if(selectNum > MaxNum)
            {
                MaxNum = selectNum;
            }
        }

        System.out.printf("Minimum number is %d, maximum number is %d", minNum, MaxNum);
    }
}