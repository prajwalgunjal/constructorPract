// any statement between try catch block is not valid
package com.bridgelabz.oops;
public class Exp5 {
    public static void main(String[] args) {
        try{
            System.out.println("Try block ");
        }
        System.out.println("hello");
        catch(ArithmeticException){
            System.out.println("catch block");
        }
    }
}
//op:- java: 'try' without 'catch', 'finally' or resource declarations