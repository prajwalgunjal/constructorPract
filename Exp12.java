// parent to child not allowed
package com.bridgelabz.oops;
public class Exp12 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch (Exception e)
        {
            System.out.println("Catch 1");
        }
        catch (ArithmeticException ae){
            System.out.println("catch 2");
        }
    }
}
//op :- error : ---> java: exception java.lang.ArithmeticException has already been caught
// here exception is the parent class and he caught the exception already so thrwoing error