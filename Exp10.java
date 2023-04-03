package com.bridgelabz.oops;
// only one catch block
public class Exp10 {
    public static void main(String[] args) {
        try{
            System.out.println("prajwal".charAt(10));
        }
        catch (Exception e){
            System.out.println("catch block "+e);
        }
        System.out.println("Rest of the code");
    }
}
// op :- catch block java.lang.StringIndexOutOfBoundsException: Index 10 out of bounds for length 7
//         Rest of the code