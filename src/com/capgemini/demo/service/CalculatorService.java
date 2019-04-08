package com.capgemini.demo.service;

import com.capgemini.demo.test.InvalidInputException;

public interface CalculatorService {
	public int addition(int number1, int number2);

	public int substraction(int number1, int number2);

	public int multiplication(int number1, int number2);

	public int division(int number1, int number2);

	public long factorial(int number) throws InvalidInputException;

	public long square(int number) throws InvalidInputException;

}
