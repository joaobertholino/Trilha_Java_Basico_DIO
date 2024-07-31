package models;

import models.exceptions.InvalidParametersException;

public class Counter {
	public static int subtraction(int x, int y) throws InvalidParametersException {
		if (x > y) {
			throw new InvalidParametersException("Parameter \"x\" is greater than parameter \"y\".");
		}
		return y - x;
	}
}
