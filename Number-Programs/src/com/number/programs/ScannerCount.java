package com.number.programs;

import java.util.Scanner;

public class ScannerCount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		long num=sc.nextLong();
		long count=0l;
		while(num>0)
		{
			count++;
			num/=10;
			
		}
		System.out.print(count+" ");
	}

}
