// 2 cases where finally block is not executed !!!!
package com.bridgelabz.oops;
public class Exp24 {
    public static void main(String[] args) {
        System.out.println(10/0); //// execption will rise here so from here program will get terminated abnormally and it will terminate
        try{
            System.out.println("try block");
        }finally {
            System.out.println("Finally block");
        }
    }
}
