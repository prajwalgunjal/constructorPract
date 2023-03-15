package com.bridgelabz.oops;

interface message{
    void gm();
    void ga();
    void gn();
}
interface name{
    void prajwal();
    void prajkta();

}
abstract class message2{
    abstract void m1();
    abstract void m2();
    abstract void m3();
}

class helper extends message2 implements message,name{

    @Override
    public void prajwal() {
        System.out.println("prajwal from 2nd interface");
    }

    @Override
    public void prajkta() {
        System.out.println("prajkta from 2nd interface");
    }

    @Override
    void m1() {
        System.out.println("Abstract method of m1");
    }

    @Override
    void m2() {
        System.out.println("Abstract method of m2");
    }

    @Override
    void m3() {
        System.out.println("Abstract method of m3");
    }

    @Override
    public void gm() {
        System.out.println("good morning");
    }
    @Override
    public void ga() {
        System.out.println("good afternoon");
    }
    @Override
    public void gn() {
        System.out.println("good night");
    }

}
class helper2 implements message{
    @Override
    public void gm() {
        System.out.println("Good morning of 2nd class");
    }

    @Override
    public void ga() {
        System.out.println("good afternoon of 2nd class");
    }

    @Override
    public void gn() {
        System.out.println("good night of the 2nd class");
    }

}
public class interfacee {
    public static void main(String[] args) {
        helper h =new helper();
        h.ga();
        h.gm();
        h.gn();
        helper2 h2 = new helper2();
        h2.gm();
        h2.ga();
        h2.gn();
        h.m1();
        h.m2();
        h.m3();
        h.prajwal();
        h.prajkta();
    }
}