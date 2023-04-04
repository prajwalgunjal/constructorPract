// we can handle multiple execption onec and throw it
package com.bridgelabz.oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exp31 {
void m2() throws InterruptedException, FileNotFoundException {
    Thread.sleep(1000);
    FileInputStream fis = new FileInputStream("abc.txt");
}
void m1(){
    try{
        m2();
    }catch (InterruptedException | FileNotFoundException a){
        System.out.println("Catch block");
    }
}

    public static void main(String[] args) {
        Exp31 e = new Exp31();
        e.m1();
    }
}