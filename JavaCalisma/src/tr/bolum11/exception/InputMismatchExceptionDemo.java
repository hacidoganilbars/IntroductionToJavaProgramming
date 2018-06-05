package tr.bolum11.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;

		do {
			try {
				System.out.print("Enter a integer: ");
				int number = input.nextInt();
				System.out.println("The number entered is: " + number);
				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("Try again. (Incorrect input: an integer is required)");
				input.nextLine();
			}
		} while (continueInput);
		input.close();
	}

}
