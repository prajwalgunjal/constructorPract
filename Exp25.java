// second case where program is getting terminated ....
package com.bridgelabz.oops;
public class Exp25 {
    public static void main(String[] args) {
        try{
            System.out.println("Try");
            System.exit(0); // program will get terminated here only
        }finally {
            System.out.println("Finally block");
        }
    }
}