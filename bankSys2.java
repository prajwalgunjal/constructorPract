// bank system using inheritance
package com.bridgelabz.oops;

import java.sql.SQLOutput;
import java.util.Scanner;

class bankAccount_number{
    void getAccount_number(){
        Scanner sc = new Scanner(System.in);
        String account_number;
        String name;
        int ChooseAccount;
        System.out.println("Enter bank account number");
        account_number=sc.next();
        System.out.println("ENter name of the account holder");
        name=sc.next();
        System.out.println("Enter account type press 1)savings 2)current ");
        ChooseAccount=sc.nextInt();

    }
}

class balance extends bankAccount_number{
    public static int balance;
    public void balance(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your balnce:");
        balance=sc.nextInt();

        System.out.println("Your balance is "+balance);
    }
}
class deposite extends balance{
    int depoAmount;
    void deposite(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Your current balance is "+balance);
        System.out.println("Enter the deposite amount");
        depoAmount=sc.nextInt();
        balance=depoAmount+balance;
        System.out.println("Your updated balance is" +balance);
    }
}

class debit extends balance{
    int debit;
    void debit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Your current balance is "+balance);
        System.out.println("Enter the debit amount");
        debit=sc.nextInt();
        debit=balance-debit;
        System.out.println("Updated balance is"+debit);
    }
}
public class bankSys2 {
    public static void main(String[] args) {
    debit d = new debit();
    deposite d1 = new deposite();
    d.getAccount_number();
    d.balance();
    d1.deposite();
    d.debit();
    }
}
