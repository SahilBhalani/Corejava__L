package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       System.out.println("Enter The Value Of A");
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();

       System.out.println("Enter The Value Of B");
       int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a+""+b);

    }
}