// param. const
package com.bridgelabz.oops;
import java.sql.SQLOutput;
import java.util.Scanner;
public class const3 {
    public static int empid,sal;
    public static String name;
    const3(int sal,int empid,String name){
        this.name=name;
        this.sal=sal;
        this.empid=empid;
        System.out.println("name is "+name);
        System.out.println("sal is"+sal);
        System.out.println("Emp id is"+empid);
    }


    public static void main(String[] args) {
        new const3(111,12,"prajwal");
    }
}
