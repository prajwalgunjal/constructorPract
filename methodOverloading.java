package com.bridgelabz.oops;
public class methodOverloading {
    void m1(){
        System.out.println("0 arg ");
    }
    void m1(int a){
        System.out.println("Int parameter");
    }
    void m1(char a){
        System.out.println("char parameter");
    }
    public static void main(String[] args) {
        methodOverloading m = new methodOverloading();
        m.m1();
        m.m1(10);
        m.m1('a');
    }
}
