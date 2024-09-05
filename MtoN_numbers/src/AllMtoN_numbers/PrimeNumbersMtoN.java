package AllMtoN_numbers;

import java.util.Scanner;

public class PrimeNumbersMtoN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start number...");
		int startNumber = sc.nextInt();
		System.out.println("enter end number...");
		int endNumber = sc.nextInt();
		for (int x = startNumber; x <= endNumber; x++) {
			int number = x;
			int count = 0;
			for (int y = 1; y <= endNumber; y++) {
				if (number % y == 0) {
					count++;
				}
			}
			if (count == 2 || x == 1) {
				System.out.print(x + " ");
			}
		}

	}

}
