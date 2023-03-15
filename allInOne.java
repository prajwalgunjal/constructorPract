package com.bridgelabz.oops;

import java.util.Scanner;

class Array{
    int[] arr = new int[5];
void takeArray(){
    System.out.println("Enter the element of the arrays");
    for(int i=0;i<arr.length;i++){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of " +i +"position");
        int a = sc.nextInt();
        arr[i]=a;
    }
}
void printarray(){
    System.out.println("Element of the array are");
    for(int i =0;i<arr.length;i++)
    {
        System.out.print(arr[i] + " ");
    }
}
    void evenoddelement(){
        System.out.println("what you want even location or odd location \n 1) odd locations \n 2) even locations ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1-> {
                for(int i=0;i<arr.length;i++)
                {
                    if(i%2==0)
                    {
                        System.out.println("even locations");
                        System.out.println(arr[i]);
                    }
                }
            }
            case 2 -> {
                for(int i=0;i<=arr.length;i++)
                {
                    if(i%2!=0)
                    {
                        System.out.println("Odd locations");
                        System.out.print(arr[i]);
                    }
                }
            }

        }


    }

    void Findduplicate(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find it is duplicate or not in array");
        int number = sc.nextInt();
        for(int i = 0;i<=arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i==j)
                {
                    System.out.println("Element found !!!!!");
                    System.out.println(arr[i]);
                }
            }
        }
}
void sortArray(){
    takeArray();
    for(int i=0;i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]>arr[j])
            {
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    System.out.println("sorted element of the array are ");
    printarray();
}
void biggestele(){
    int biggest =arr[0];
    for(int i =0;i< arr.length;i++)
    {
        if(biggest<arr[i])
        {
            biggest=arr[i];
        }
    }
    System.out.println("biggets number of the array is "+biggest);
}

void SecondLargetsElement(){

}
}

public class allInOne {

    public static void main(String[] args) {
        Array a = new Array();
        a.sortArray();
    }
}