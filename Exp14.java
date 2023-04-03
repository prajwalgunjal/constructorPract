/// category 3 : -    pipe
package com.bridgelabz.oops;

public class Exp14 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            System.out.println("prajwal".charAt(10));
        }catch (ArithmeticException | NumberFormatException ae)
        {
            System.out.println("Arithmetic exception " +ae);
        }
        catch (StringIndexOutOfBoundsException | ClassCastException | NullPointerException a){
            System.out.println("String inedx " +a);
        }
        System.out.println("rest of the code");
    }
}
