package AllMtoN_numbers;

import java.util.Scanner;

public class SpyNumbersMtoN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start number...");
		int startNumber = sc.nextInt();
		System.out.println("enter end number...");
		int endNumber = sc.nextInt();
		for (int x = startNumber; x <= endNumber; x++) {
			int last = 0;
			int temp = x;
			int sum = 0;
			int fact = 1;
			while (temp > 0) {
				last = temp % 10;
				sum += last;
				fact *= last;
				temp /= 10;
			}
			if (sum == fact) {
				System.out.println(x);
			}
		}
	}
}
