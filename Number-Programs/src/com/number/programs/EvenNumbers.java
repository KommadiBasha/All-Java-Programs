package com.number.programs;

public class EvenNumbers {

	public static void main(String[] args) {
		int NUMBER = 1;
		while (NUMBER <= 50) {
			if (NUMBER % 2 == 0) {
				System.out.print(NUMBER + " ");
			}
			NUMBER++;
		}
	}

}
