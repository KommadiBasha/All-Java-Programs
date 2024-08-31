package com.number.programs;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  number ...");
		int number1 = sc.nextInt();
		int store=number1+1;
		int original=store;
		int square=0;
		int sum=0;
		while(store>0)
		{
			int last=store%10;
			sum=sum+last;
			store/=10;
		}
		square=sum*sum;
		if(original==square)
			System.out.println("sunny number...");
		else
			System.out.println("not sunny number...");
	}

}
