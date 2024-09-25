package com.pattern.programs;

import java.util.Scanner;

public class Hollowrectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row...");
		int row = sc.nextInt();
		System.out.println("enter column...");
		int column = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (i == row || j == column || i == 1 || j == 1) {
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
