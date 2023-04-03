
package com.bridgelabz.oops;

import java.io.FileNotFoundException;

public class Exp15 {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException | FileNotFoundException ae){
            System.out.println("Catch block");
        }
    }
}


//op :- java: exception java.io.FileNotFoundException is never thrown in body of corresponding try statement