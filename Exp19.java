// if we declare resources of type checked exception then try catch block is mandatory
package com.bridgelabz.oops;

import java.io.FileInputStream;
import java.io.IOException;

public class Exp19 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("abc.txt"))
        {
            System.out.println("hi sir how are you ");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
// this is checked exception so catch block is mandatory