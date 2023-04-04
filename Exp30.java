package com.bridgelabz.oops;

public class Exp30 {
    void studdetails() throws InterruptedException{
        System.out.println("prajwal sleeping");
        Thread.sleep(1000);
        System.out.println("Prajwal2 sleeping ");
    }
    void hod() throws InterruptedException{
            studdetails();

    }
    public static void main(String[] args)throws InterruptedException {
        Exp30 e = new Exp30();
        e.hod();
    }
}
