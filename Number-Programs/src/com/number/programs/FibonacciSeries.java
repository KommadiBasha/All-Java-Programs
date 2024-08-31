package com.number.programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  a number upto where ...");
		int number = sc.nextInt();
		int a=0;
		int b=1;
		for(int i=0;i<=number;i++)
		{
			System.out.print(a);
			int c=a+b; //1
			a=b;
			b=c;
		}
		}
}
