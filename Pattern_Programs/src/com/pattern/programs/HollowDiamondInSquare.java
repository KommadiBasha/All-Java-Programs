package com.pattern.programs;

import java.util.Scanner;

public class HollowDiamondInSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number..");
		int row = sc.nextInt();
		 int mid = row / 2; 
		for (int i = 0; i <=row; i++) {
			for (int j = 0; j <= row; j++) {
				if (i == 0 || i == row -1 || j == 0|| j == row-1 ) {
					System.out.print("* ");
				}
				 else if ((i + j == mid) || (j - i == mid) || (i - j == mid) || (i + j == row + mid - 1)) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
				}
			System.out.println("pending");
		}
	}

}
