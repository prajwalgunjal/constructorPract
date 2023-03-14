// method overriding
// change the method of parent class if you are not satisfied with that code
package com.bridgelabz.oops;



class parent3{

    //overridden methid
void m1(){
    System.out.println("m1 method of parent class");
}
}
public class poly4 extends parent3{

    // overloading method
    @Override
    void m1() {
        System.out.println("M1 method of the child class");
    }
    void m2(){
        System.out.println("this is m2 mehtod of chidl class ");
    }

    public static void main(String[] args) {
        poly4 p4= new poly4();
        p4.m1(); // this will print child class method i.e overloading method
        parent3 p = new poly4();
        p.m1();  // after doing this also this will print overloaded method
        //p.m2();
        // this will throw error bez parent class ref is able to hold child class object but it will print only methods
        // which are present in parent class
        // to overcome this we have to typecast those object
        poly4 p1 = (poly4) p;
        p1.m2(); /// now this will print the method from child class
    }
}