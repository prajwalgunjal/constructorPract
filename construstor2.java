package com.bridgelabz.oops;

public class construstor2 {



    int Empno,sal;
    String name;
    construstor2(){
        Empno=10;
        sal=20000;
        name="Prajwal";
    }


    void display(){
        System.out.println(Empno);
        System.out.println(sal);
        System.out.println(name);
    }


    public static void main(String[] args) {
        new construstor2().display();
    }
}
