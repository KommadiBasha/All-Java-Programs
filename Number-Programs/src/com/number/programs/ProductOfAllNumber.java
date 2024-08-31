package com.number.programs;

import java.util.Scanner;

public class ProductOfAllNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number...");
		int num = sc.nextInt();
		int product = 1;
		for (int i = 1; i <= num; i++) {
			int last = num % 10;
			product *= last;
			num = num / 10;
		}
		System.out.println(product);
	}

}
