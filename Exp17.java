// parent and chidld class mix not allowed
package com.bridgelabz.oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exp17 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("abc.txt");
        }
        catch (IOException | FileNotFoundException ae ){
            System.out.println("File not found");
        }
    }
}


// op :- --- java: Alternatives in a multi-catch statement cannot be related by subclassing
//  Alternative java.io.FileNotFoundException is a subclass of alternative java.io.IOException