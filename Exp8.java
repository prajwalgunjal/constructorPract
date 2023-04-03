package com.bridgelabz.oops;
public class Exp8 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            System.out.println("prajwal");
            System.out.println("prajwal2");
        }catch (ArithmeticException ae){
            System.out.println("Catch block");
        }
    }
}
//op :- catch block
// exception occures in first line of the try block