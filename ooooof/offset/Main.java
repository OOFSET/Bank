package ooooof.offset;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static double currentBalance;
    public static double moneyOnHand;
    public static double withdrawAmount;
    public static double depositAmount;
    public static String customerName;
    public static double openingAmount;

    public static void main(String[] args) {

        Scanner accountScanner = new Scanner(System.in);
        String accountName = accountScanner.nextLine();


        setValues(300, 1000);
        System.out.print("Enter command:");
        System.out.print("1. Current Balance:");
        System.out.print("2. Widthdraw Money From Account:");
        System.out.print("3. Deposit Money From Account:");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            // current balance
            case 1: {
                log("Your Balance Is [" + currentBalance + "]");
                break;
            }
            // widthdraw money
            case 2: {
                log("How much would you like to withdraw [Your Balance is " + currentBalance + "]");
                Scanner withdrawScanner = new Scanner(System.in);
                double amount = withdrawScanner.nextDouble();
                if (currentBalance < amount) {
                    log("Your balance is lower then the amount you want to withdraw");
                } else {
                    setBalance(currentBalance - amount);
                    log("Your balance is now " + currentBalance);

                }


                break;
            }
            // deposit money
            case 3: {
                log("How much would you like to deposit [Your Balance is " + currentBalance + "]");
                Scanner depositScanner = new Scanner(System.in);
                double amount = depositScanner.nextDouble();
                if (moneyOnHand < amount) {
                    log("Your money on hand is lower then the amount you want to deposit");
                } else {
                    setBalance(currentBalance + amount);
                    log("Your balance is now " + currentBalance);

                }


                break;
            }


        }


    }

    public static void setValues(double bal, double cash) {
        currentBalance = bal;
        moneyOnHand = cash;
        withdrawAmount = 0;
        depositAmount = 0;
        customerName = "";
        openingAmount = 0;
    }

    public static void setBalance(double bal) {
        currentBalance = bal;
    }

    public static void setCash(double cash) {
        moneyOnHand = cash;
    }

    public static void setCustomerName(String name) {
        customerName = name;
    }

    public static void log(String logMsg) {
        System.out.print(logMsg);
    }

    public static void exit(int time) {
        System.exit(time);
    }
}
