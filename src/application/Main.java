package application;

import models.Counter;
import models.exceptions.InvalidParametersException;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		int firstNumber = in.nextInt();

		System.out.print("Enter the second integer: ");
		int secondNumber = in.nextInt();

		printNumbers(firstNumber, secondNumber);
	}

	private static void printNumbers(int x, int y) {
		try {
			int counter = Counter.subtraction(x, y);
			for (int i = 0; i < counter; i++) {
				System.out.println("Imprimindo numero: " + i);
			}
		} catch (InvalidParametersException e) {
			System.out.println(e.getClass() + " - " + e.getMessage());
		}
	}
}