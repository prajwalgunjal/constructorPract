package com.bridgelabz.oops;
import java.util.Scanner;

class data{
    private static int age;
    private static String name;
    private static String city;

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        data.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        data.name = name;
    }

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        data.city = city;
    }
    data(){
        System.out.println("name is "+getName());
        System.out.println("age is "+getAge());
        System.out.println("city is "+getCity());
    }
static void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name");
    String name = sc.next();
    setName(name);
    System.out.println("ENter age ");
    int age = sc.nextInt();
    setAge(age);
    System.out.println("Enter city");
    String city = sc.next();
    setCity(city);
}
}
public class encapsulation extends data {
    public static void main(String[] args) {
    input();
    new data();
    }

}