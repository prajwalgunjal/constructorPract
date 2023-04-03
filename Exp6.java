//exception raise in the catch b;lock then it is abnoraml exception
package com.bridgelabz.oops;
public class Exp6 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException ae ){
            System.out.println(10/0);
        }
        System.out.println("rest of the code");
    }
}
// op :- abnoraml termination---->  Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.bridgelabz.oops.Exp6.main(Exp6.java:8)
