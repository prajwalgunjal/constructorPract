// simple flow of inheritance
package com.bridgelabz.oops;

class m1{
    int a ;
    int b;
    void m1(){System.out.println("this is base class");}
}
class m2 extends m1{
    int c;
    int d;
    void m2(){
        System.out.println("value of a is" +a);
        System.out.println("value of b is" +b);
        System.out.println("value of c is "+c);
        System.out.println("value of d is "+d);
        System.out.println("this is m2");}
}
public class inheritance extends m2 {
    public static void main(String[] args) {
        inheritance i = new inheritance();
        i.a=10;
        i.b=20;
        i.c=30;
        i.d=40;
        i.m1();
        i.m2();
    }
}
