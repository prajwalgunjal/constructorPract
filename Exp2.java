package com.bridgelabz.oops;
public class Exp2 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("Catch block");
        }
        System.out.println("Rest of the code");
    }
}


//op:-
//        Catch block
//        Rest of the code