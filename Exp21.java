// in abnoraml termination also finally block is getting executed
package com.bridgelabz.oops;

public class Exp21 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (NullPointerException ar){
            System.out.println("catch");
        }finally {
            System.out.println("Finally block");
        }
    }
}
// Finally block
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.bridgelabz.oops.Exp21.main(Exp21.java:7)