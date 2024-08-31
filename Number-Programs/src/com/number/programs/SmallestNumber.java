package com.number.programs;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number...");
		int number1 = sc.nextInt();
		System.out.println("Enter Second number...");
		int number2 = sc.nextInt();
		System.out.println("Entered numbers "+ "number1 = "+number1 + "     number2 "+number2);
		if(number1<number2)
		System.out.println("The smallest number is" + number1 );
		else
			System.out.println("The greatest number is " + number2);

	}

}
