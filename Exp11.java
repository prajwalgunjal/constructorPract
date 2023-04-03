// child to parent
package com.bridgelabz.oops;

public class Exp11 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("catch block 1");
        }
        catch (Exception e){
            System.out.println("Catch block");
        }
    }
}


// op:- catch block 1
// arithmetic excpetion is a child class of the exception clas  this is allowed