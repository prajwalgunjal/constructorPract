package com.bridgelabz.oops;
class test2{
    void m1(){
        System.out.println("this is parent class method m1()");
    }
}
public class methodOverriding extends m1{
    @Override
    void m1() {
        System.out.println("this is child class method ");
    }

    public static void main(String[] args) {
        methodOverriding m1 = new methodOverriding();
        m1.m1();
    }
}
