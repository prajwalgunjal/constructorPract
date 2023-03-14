package com.bridgelabz.oops;

class parent2{
    parent2(){
        System.out.println("this is zero arg constructor of parent class");
    }
}

class child extends parent2{

    child(){
        this(10);   ///// this will call the another constructor from the same class.
        System.out.println("THis is zero arg constructor of child class");
    }
    child(int a){
        super();  //// this will call the parent class constructor
        System.out.println("this is 1 arg constructor ");
    }
}
public class Constructor4 extends parent2 {
    public static void main(String[] args) {
        new child();
    }
}
