// app without try catch block
package com.bridgelabz.oops;
public class Exp1 {
    public static void main(String[] args) {
        System.out.println("Prajwal");
        System.out.println(10/0);
        System.out.println("Rest of the code");
    }
}
// this will throw error not handled any type of exception
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at com.bridgelabz.oops.Exp1.main(Exp1.java:6)
//        Prajwal
////