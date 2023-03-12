// constructor
// normal flow of the constructor
package com.bridgelabz.oops;

public class constructor {
void m1(){
    System.out.println("m1 method");
}

    constructor(){
        System.out.println("0 arg constructor");
    }
    constructor(int a){
        System.out.println("1 arg constructor");
    }
    constructor(int a, int b){
        System.out.println("2 arg constructor");
    }
    public static void main(String[] args) {
        constructor c = new constructor();
        new constructor(10);
        new constructor(10,20);
        c.m1();
    }
}
