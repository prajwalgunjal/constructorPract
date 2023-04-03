// mix checked and unchgecked
package com.bridgelabz.oops;
public class Exp16 {
    public static void main(String[] args) {
        try{
            Thread.sleep(1000);
        }catch (InterruptedException | ArithmeticException ae){
            System.out.println("IO Exception");
        }
        System.out.println("Rest of the code ");
    }
}
// must contain try block for checked expression
//op :- Rest of the code