package com.FirstJava;

public class ForLoop {
	public static void main(String[] args) {
		int a = 5;

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int b = 5;
		for (int i = 1; i <= b; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
