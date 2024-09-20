package com.pattern.programs;

import java.util.Scanner;

public class ReverseTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row...");
		int row = sc.nextInt();
		for (int i = row; i>=1; i--) {
			for (int j = 1; j <= row-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
