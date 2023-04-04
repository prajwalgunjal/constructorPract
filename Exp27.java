// what will be the value of x
package com.bridgelabz.oops;

public class Exp27 {

    int m1() {
        try {
            return 10;
        } catch (ArithmeticException ae) {
            return 20;
        } finally {
            return 30;
        }
    }

    public static void main(String[] args) {
        Exp27 e = new Exp27();
        int x = e.m1();
        System.out.println(x);

    }
}
// this will print final blocks value  beacuse at the end of the code that block is executed