// category 1: approaches : -
// 1) multiple catch block
// 2) one catch block
// 3) diff diff catch block
// 4) parent to child


//case 1)  multiple catch block
package com.bridgelabz.oops;
public class Exp9 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            System.out.println("prajwal".charAt(10));
        }catch (ArithmeticException ae){
            System.out.println(10/2);
        }
        catch (StringIndexOutOfBoundsException siob)
        {
            System.out.println("Out of bound exception");
        }
    }
}
// op :- 5