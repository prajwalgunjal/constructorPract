// jari exception catch zalai tri finally block run honar ch
package com.bridgelabz.oops;

public class Exp22 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException ae){
            System.out.println("catch ");
        }finally {
            System.out.println(10/0);
        }
    }
}
