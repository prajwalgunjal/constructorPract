// super and this keyword in inheritance
// this is normal eg of the inheritance but what if we initiate all the variable as a b and c all the program contains a b and c
package com.bridgelabz.oops;



class parent{
    int a =10;
    int b=20;
}
public class Super_ThisUsingInheritance1 extends parent {
    int x=100;
    int y=200;
    void add(int i,int j){
        System.out.println(a+b);;
        System.out.println(x+y);
        System.out.println(i+j);
    }
    public static void main(String[] args) {
        Super_ThisUsingInheritance1 s =new Super_ThisUsingInheritance1();
        s.add(1000,2000);
    }
}
