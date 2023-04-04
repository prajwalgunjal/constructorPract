// try with resources .../ when you declare resources with
package com.bridgelabz.oops;
import java.util.Scanner;
public class Exp18 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter number :- ");
            int num = sc.nextInt();
            System.out.println("you Entered " +num);
        }
    }
}