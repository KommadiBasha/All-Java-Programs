package com.pattern.programs;

import java.util.Scanner;

public class InvertedRightAnglePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number..");
		int num = sc.nextInt();
		for (int i = num; i >=1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
