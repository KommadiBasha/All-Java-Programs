
package com.number.programs;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number...");
		int number1 = sc.nextInt();
		System.out.println("Enter Second number...");
		int number2 = sc.nextInt();
		System.out.println("Entered numbers "+ "number1 = "+number1 + "     number2 "+number2);
		
		int store=(number1>number2 )?number1:number2;
		System.out.println("GreatestNumber   "+store);

	}

}
