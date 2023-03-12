package com.bridgelabz.oops;


import org.w3c.dom.ls.LSOutput;

class m5{
    void m1(){
        System.out.println("m1 method");
    }

}
class m6 extends m5{
    void m2(){
        super.m1();
        System.out.println("m2 method");
    }
}
public class inheritance_call_method extends m6{
    public static void main(String[] args) {
        inheritance_call_method icm = new inheritance_call_method();
        icm.m2();
    }
}