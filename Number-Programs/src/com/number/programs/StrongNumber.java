package com.number.programs;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  a number ...");
		int number = sc.nextInt();
		int originalNumber = number;
		int sum = 0;

		while (number > 0) {
			int last = number % 10;
			int fact = 1;
			for (int i = 1; i <= last; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			number /= 10;
		}
		System.out.println(sum);
		if (originalNumber == sum)
			System.out.println("Strong number");
		else
			System.out.println("not a strong number");

	}

}
