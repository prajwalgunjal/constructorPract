//try - catch block not matched
package com.bridgelabz.oops;
public class Exp3 {
    public static void main(String[] args) {
       try{
           System.out.println(10/0);
       }catch (NullPointerException np) {
            System.out.println("Catch block");
        }
        System.out.println("Rest of the code");
    }
}

//op :- thorws error not ended properly terminated abnormally
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at com.bridgelabz.oops.Exp3.main(Exp3.java:6)
