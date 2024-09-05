package AllMtoN_numbers;

import java.util.Scanner;

public class PerfectSquareNumbersMtoN_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start number...");
		int startNumber = sc.nextInt();
		System.out.println("enter end number...");
		int endNumber = sc.nextInt();
		System.out.println("printing 1 to 50 prefect square numbers");
		for (int x = startNumber; x <= endNumber; x++) {
			int square = 0;
			if (x <= endNumber) {
				square = x * x;
			}
			System.out.print(square + " ");
		}
	}
}
