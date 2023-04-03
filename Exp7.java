// it goes line by line before having exception it will perform all the activies which are present before exception
package com.bridgelabz.oops;
public class Exp7 {
    public static void main(String[] args) {
        try{
            System.out.println("prajwal");
            System.out.println("gunjal");
            System.out.println(10/0);
        }
        catch (ArithmeticException ae){
            System.out.println("Catch block");
        }
        System.out.println("Rest of the code");
    }

}


// op:prajwal
//gunjal
//Catch block
//Rest of the code