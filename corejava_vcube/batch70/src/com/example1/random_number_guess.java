package com.example1;

import java.util.*;

public class random_number_guess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int input = -1;
		int ran = r.nextInt(10);
		int i;
		for (i = 0; i < 3; i++) {
			System.out.print("Provide your input (Attempt " + (i + 1) + "/3): ");
			input = sc.nextInt();
			if (input > ran) {
				System.out.println("your input is greater than the random number");
			} else if (input == ran) {
				System.out.println("congrats your input is correct");
				break;
			} else {
				System.out.println("your input is less than the random number");
			}

		}
		if (input != ran) {
			System.out.println("Your turns are completed! The number was: " + ran);
			System.out.println("Better luck next time!");
		}

	}

}
