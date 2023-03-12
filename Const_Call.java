package com.bridgelabz.oops;
import java.util.Scanner;
public class Const_Call {
String name;
int id,age;
    Const_Call(){
        this(10);
        System.out.println("normal const");
    }

    Const_Call(int a){
        this(10,20);
        System.out.println("name is"+name);
        System.out.println("id is"+id);
        System.out.println("age is "+age);
    }
    Const_Call(int a,int b){
        System.out.println("Enter name ");
        name=new Scanner(System.in).next();
        System.out.println("Enter age: ");
        age=new Scanner(System.in).nextInt();
        System.out.println("ENter ID: ");
        id = new Scanner(System.in).nextInt();
    }

    public static void main(String[] args) {
        new Const_Call();
    }
}