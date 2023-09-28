package com.test;

import com.sun.corba.se.impl.orbutil.concurrent.SyncUtil;

import java.text.DecimalFormat;
import java.util.Scanner;

public class chapter2 {
    public static void main(String[] args) {
        double amount = 0;
        double rate = 0;
        int year = 0;
        // ask amount value to user
        Scanner amountinput=new Scanner(System.in);
        System.out.println("Enter amount:");
        amount=amountinput.nextDouble();
        // ask rate of interest value to user
        Scanner rateinput=new Scanner(System.in);
        System.out.println("Enter rate of intrest:");
        rate=rateinput.nextDouble();
        // ask years value to user
        Scanner yearinput=new Scanner(System.in);
        System.out.println("Enter years:");
        year=yearinput.nextInt();

        double futurevalue=0;

        futurevalue= amount*((1+rate)*year);

        System.out.println("Futurevalue="+futurevalue);
        System.out.println("Formatted Futurevalue="+DecimalFormat.getInstance().format(futurevalue));


    }
}


/*
 Write a program that accepts the investment amount (double), monthly interest rate (double), and number of years (int) from the user. The program will then display the future value of the investment using the following formula:
○ 𝑓𝑢𝑡𝑢𝑟𝑒𝑉𝑎𝑙𝑢𝑒 = 𝑖𝑛𝑣𝑒𝑠𝑡𝑚𝑒𝑛𝑡𝐴𝑚𝑜𝑢𝑛𝑡 × (1 + 𝑚𝑜𝑛𝑡h𝑙𝑦𝐼𝑛𝑡𝑒𝑟𝑒𝑠𝑡𝑅𝑎𝑡𝑒)𝑦𝑒𝑎𝑟𝑠
 */