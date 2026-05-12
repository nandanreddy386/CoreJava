package com.example1;

import java.util.Scanner;

public class Aprl29_task {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        int n1 = sc.nextInt();

        System.out.println("Enter the 2nd number:");
        int n2 = sc.nextInt();

        int sum = 0;

        if (n1 < 0 || n2 < 0) {
            System.out.println("Invalid number for prime number");
        } 
        else {
            for (int i = n1; i <= n2; i++) {
                int count = 0;

                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }

                if (count == 2) {
                    sum = sum + i;
                }
            }

            System.out.println("Sum of prime numbers = " + sum);
        }

        sc.close();
    }
}