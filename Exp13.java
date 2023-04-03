// category 2 : - printing exceptions
// 1) print by using ref
// 2) print by using getmessage()
// 3) print by using printstackTrace();  --- most commonly used
// this print where exactly exception occurs
package com.bridgelabz.oops;
public class Exp13 {
    void m1(){
        m2();
    }
    void m2(){
        m3();
    }
    void m3(){
        try {
            System.out.println(10 / 0);
        }catch (ArithmeticException ae)
        {
            System.out.println();
            System.out.println("printing by using refrence");
            System.out.println(ae);  //// printing by using refrence
            System.out.println("printing by using to string");
            System.out.println(ae.toString());
            System.out.println("printing by using getmessage");
            System.out.println(ae.getMessage());   // usign get message
            System.out.println("Printing by using stack trace");
            ae.printStackTrace();  // using stack trace
        }
    }
    public static void main(String[] args) {
        Exp13 exp13 = new Exp13();
        exp13.m1();
    }
}


//op:- printing by using refrence
//java.lang.ArithmeticException: / by zero
//printing by using to string
//java.lang.ArithmeticException: / by zero
//printing by using getmessage
/// by zero
//Printing by using stack trace
//java.lang.ArithmeticException: / by zero
//	at com.bridgelabz.oops.Exp13.m3(Exp13.java:16)
//	at com.bridgelabz.oops.Exp13.m2(Exp13.java:12)
//	at com.bridgelabz.oops.Exp13.m1(Exp13.java:9)
//	at com.bridgelabz.oops.Exp13.main(Exp13.java:32)