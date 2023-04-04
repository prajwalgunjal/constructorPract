// if there is exception in all the block then jvm will throw only finally block exception
package com.bridgelabz.oops;

public class Exp26 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException ae)
        {
            System.out.println("prajwal".charAt(10));
        }finally {
            int[] a ={10,20,30};
            System.out.println(a[10]);
        }
    }
}

// this will only throw finally block exception
// op :- Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
//	at com.bridgelabz.oops.Exp26.main(Exp26.java:13)