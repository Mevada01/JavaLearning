package com.FirstJava;

public class IfElse {
    public static void main(String[] args) {
        int a = 10, b = 4, c = 10; 

        if (a > b) {
            if (a > c) {
                System.out.println("A is the max number");
            } else if (a == c) {
                System.out.println("A and C are Equal");
            } else {
                System.out.println("C is the max number");
            }
        } else if (b > c) {
            System.out.println("B is the max number");
        } else if (b == c) { 
            System.out.println("B and C are Equal");
        } else {
            System.out.println("C is the max number");
        }
    }
}
