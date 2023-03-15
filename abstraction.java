package com.bridgelabz.oops;
abstract class testAbstract{
    abstract void m1();
    abstract void m2();
    abstract void m3();
}
abstract class test2Abstract extends testAbstract{
    @Override
    void m1() {
        System.out.println("child class of the m1 method");
    }

}
abstract class test3Abstract extends test2Abstract{
    @Override
    void m2() {
        System.out.println("child class of the m2 mehtod ");
    }
    test3Abstract(){
        System.out.println("constructor of the abstrct class test3");
    }
}
class test4Abstract extends test3Abstract{
    @Override
    void m3() {
        System.out.println("Child class of the m3 method");
    }
    test4Abstract(){
        super();
        System.out.println("Constructor of the child class test 4");
    }
}
public class abstraction extends test4Abstract {
    public static void main(String[] args) {
        test2Abstract t2 = new test4Abstract();
        t2.m1();
        t2.m2();
        t2.m3();
    }
}
