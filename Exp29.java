// Throws : - when we dont want to handle exceptioon in same class then we have to use throws keyword and we have to passon the exception to the
// caller class who will take care of the handling the exception
package com.bridgelabz.oops;
public class Exp29 {
void studdetails() throws InterruptedException{
    System.out.println("prajwal sleeping");
    Thread.sleep(1000);
    System.out.println("Prajwal2 sleeping ");
}
void hod(){
    try {
        studdetails();
    }catch (InterruptedException ie){
        System.out.println("Interupted excption");
    }

}
    public static void main(String[] args) {
    Exp29 e = new Exp29();
    e.hod();
    }
}

