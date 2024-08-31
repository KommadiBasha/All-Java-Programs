package com.number.programs;

import java.util.Scanner;

public class SwappingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number ...");
		int number1 = sc.nextInt();
		System.out.println("enter second number ...");
		int number2 = sc.nextInt();
		System.out.println("entered numbers : num1 "+number1 +"   num2 "+ number2);
		int temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("after swapping...");
		System.out.println("num 1 "+number1);
		System.out.println("num 2 "+number2);

	}

}
