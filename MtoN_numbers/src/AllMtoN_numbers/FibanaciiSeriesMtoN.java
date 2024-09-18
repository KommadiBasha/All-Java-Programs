package AllMtoN_numbers;

import java.util.Scanner;

public class FibanaciiSeriesMtoN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start number...");
		int startNumber = sc.nextInt();
		System.out.println("enter end number...");
		int endNumber = sc.nextInt();
		int first = 0;
		for (int x = startNumber; x <= endNumber; x++) {
			int next = first + startNumber;
			System.out.print(next + ", ");
			first = startNumber;
			startNumber = next;
		}
	}
}
