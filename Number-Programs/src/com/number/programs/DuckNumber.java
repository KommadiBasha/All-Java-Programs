package com.number.programs;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  number ...");
		int number1 = sc.nextInt();
		 int count=0;
		 while(number1>0)
		 {
			int last= number1%10;
			if(last==0 )
			{
				count++;
			}
			number1/=10;
		 }
		 if(count==1)
			{
				System.out.println("duck number...");
			}
			else
			{
				System.out.println("not a duck number...");
			}
	}
}
