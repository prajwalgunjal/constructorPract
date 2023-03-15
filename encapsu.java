package com.bridgelabz.oops;
import java.util.Scanner;
class encapsulationTech{
    // private members
    //getter setter
    private int acc_no;
    private String Name;
    private int Balance;
    private String password;
    private int AccountBal;
    private int depositeAmount;
    private int credit;
    public encapsulationTech() {

    }
    public int getAcc_no() {
        return acc_no;
    }
    public int getDepositeAmount() {
        return depositeAmount;
    }
    public int getCredit() {
        return credit;
    }
    public void setCredit(int credit) {
        this.credit = credit;
        this.credit+=this.AccountBal;
    }
    public void setDepositeAmount(int depositeAmount) {
        this.depositeAmount = depositeAmount;
        this.depositeAmount=this.AccountBal-this.depositeAmount;
    }
    public int getAccountBal() {
        return AccountBal;
    }
    public void setAccountBal(int accountBal) {
        AccountBal = accountBal;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getBalance() {
        return Balance;
    }
    public void setBalance(int balance) {
        Balance = balance;
    }
    void display(){
        System.out.println(getName());
        System.out.println(getAcc_no());
        System.out.println(getBalance());
    }
    void CheckAccBal(){
        setAccountBal(100000);
        System.out.println("Your account balance is "+getAccountBal());
    }
    public void deposite() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How mucch mony you want to deposite??");
        System.out.println("your current balance is " +getAccountBal());
        int DeposteAmount = sc.nextInt();
        setDepositeAmount(DeposteAmount);
        System.out.println("Updated balance is "+getDepositeAmount());
    }
    public void credit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How much amount do you want to credit :");
        int credit = sc.nextInt();
        setCredit(credit);
        System.out.println("updated balance is "+getCredit());
    }
}
public class encapsu extends encapsulationTech{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        encapsulationTech e = new encapsulationTech();
        while (true) {
            System.out.println("**********Welcome to prajwal Bank of india**********");
            System.out.println("Choose your operation");
            System.out.print("1)check acc balance\n2)deposite\n3)credit\n4)Exit");
            int operation = sc.nextInt();
            switch (operation) {
                case 1 -> {
                    e.CheckAccBal();
                }
                case 2 -> {
                    e.deposite();
                }
                case 3 -> {
                    e.credit();
                }
                case 4->{
                    System.exit(0);
                }
            }
        }
    }
}