package AllMtoN_numbers;

import java.util.Scanner;

public class ArmstrongNumbersMtoN_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start number...");
		int startNumber = sc.nextInt();
		System.out.println("enter end number...");
		int endNumber = sc.nextInt();
		for (int x = startNumber; x <= endNumber; x++) {
			int number1 = x;
			int number2 = x;
			int sum = 0;
			int count = 0;

			while (number1 > 0) {

				count++;
				number1 /= 10;
			}
			while (number2 > 0) {
				int last = number2 % 10;
				int fact = 1;
				for (int i = 1; i <= count; i++) {
					fact *= last;
				}
				number2 /= 10;
				sum += fact;
			}
			if (x == sum) {
				System.out.print(x + " ");
			}
		}
	}

}
