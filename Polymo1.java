// 2 types 1) compile-time 2) runtime
// 1) compiletime contain 3 types
// 1) method overloading 2) constructor overloading 3) operator overloading

//1) method overloading
// mapping is dont at the compilation time so it is called as complietime polymor....
package com.bridgelabz.oops;


class test{
    void m1(int a){
        System.out.println("int m1 method");
    }
    // overloaded method
    void m1(int a,int b){
        System.out.println("int,int m1 method");
    }
    void m1(char ch){
        System.out.println("char m1 method");
    }
}
public class Polymo1 {
    public static void main(String[] args) {
    test t = new test();
    t.m1(10);
    t.m1(10,20);
    t.m1('a');
    }
}