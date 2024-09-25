package com.pattern.programs;

import java.util.Scanner;

public class HollowDiamondPattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row...");
		int row = sc.nextInt();
		int num = row;
		int star = 1;
		int space = row / 2;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				if (k == 1 || k == star) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if (i < num / 2) {
				star += 2;
				space--;
			} else {
				star -= 2;
				space++;
			}
		}
	}
}
