// Construcotr overloading
package com.bridgelabz.oops;
public class PolyMor2 {
    PolyMor2(){
        System.out.println("0 arg constructor ");
    }
    PolyMor2(int a){
        System.out.println("1 arg const ");
    }
    PolyMor2(char ch,int a ){
        System.out.println("2 arg constructor");
    }

    public static void main(String[] args) {
        new PolyMor2();
        new PolyMor2(10);
        new PolyMor2('a',10);
    }
}
