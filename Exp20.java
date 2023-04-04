// // finally block : - finally block is always excecuted in noraml and abnormal termination
package com.bridgelabz.oops;
public class Exp20 {
    public static void main(String[] args) {
        try{
            System.out.println("Try block");
        }catch (ArithmeticException ae){
            System.out.println("Catch block ");
        }finally {
            System.out.println("Finally block ");
        }
    }
}