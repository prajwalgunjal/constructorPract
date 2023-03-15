//banksys using construsctor
package com.bridgelabz.oops;
class abc{
    abc(){
        System.out.println("is is abc class");
    }
}
class bank extends abc{
bank(int accountnumber,int balance,String name){
    super();
    System.out.println("Account number is "+accountnumber);
    System.out.println("Balance is "+balance);
    System.out.println("name is "+name);
}
bank(int accountNumber){
    this(10,"jj");
    System.out.println("account number is "+accountNumber);
}
bank(int balance,String name){
    System.out.println("balance is "+balance);
    System.out.println("name is "+name);
}
}
public class banksys3 {
    public static void main(String[] args) {
        bank b = new bank(1234,2000,"prajwal");
        new bank(1234);
        new bank(2000,"prajkta");
    }
}
