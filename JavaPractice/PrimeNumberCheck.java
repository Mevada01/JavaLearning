package com.FirstJava;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int num = 37; 
        
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } else if (num == 2) {
            System.out.println(num + " is a prime number.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
}
