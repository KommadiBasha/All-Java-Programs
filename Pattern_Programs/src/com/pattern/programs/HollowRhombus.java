package com.pattern.programs;

import java.util.Scanner;

public class HollowRhombus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number..");
		int num = sc.nextInt();
		int mid = num / 2;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= num; j++) {
				if (i == 1 || j == 1 || i == num || j == num) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();

		}
	}

}
