// nested try block
package com.bridgelabz.oops;

import java.util.Scanner;

public class Exp28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        try{
            System.out.println((10/num));
            try
            {
                System.out.println("ratan".charAt(10));
            }
            catch (StringIndexOutOfBoundsException siobe){
                System.out.println("out of bounds ");
            }
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }
        finally {
            System.out.println("finally block");
        }
        System.out.println("rest of the code");
    }
}


//op: ----
// Enter a number 2
//        5
//        out of bounds
//        finally block
//        rest of the code


//case 2 -Enter a number
//0
//java.lang.ArithmeticException: / by zero
//finally block
//rest of the code