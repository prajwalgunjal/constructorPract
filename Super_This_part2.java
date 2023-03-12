// here we will assign same variable name to all the variables
package com.bridgelabz.oops;
class parent1{
    int a=10;
    int b=20;
}
public class Super_This_part2 extends parent {
    int a=100;
    int b=200;
    void addii(int a ,int b){
        System.out.println(this.a+this.b);  //// this will take current class variable
        //System.out.println(a+b);
        System.out.println(super.a+super.b); ////super will take parent class variable
//        System.out.println(a+b);
        System.out.println(a+b); /// it takes local variable it passed from main method
    }
    public static void main(String[] args) {
        Super_This_part2 s1= new Super_This_part2();
        s1.addii(5000,1000);
    }
}