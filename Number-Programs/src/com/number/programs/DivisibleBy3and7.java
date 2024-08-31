package com.number.programs;

import java.util.Scanner;

public class DivisibleBy3and7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  a number...");
		int number = sc.nextInt();
		if (number % 3 == 0 && number % 7 == 0) {
			System.out.println("Yes this " + number + " number divisible by 3 and 7");
		} else
			System.out.println("Not divisible ");

	}

}
