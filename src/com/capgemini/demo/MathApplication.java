package com.capgemini.demo;
import com.capgemini.demo.service.CalculatorService;
import com.capgemini.demo.test.InvalidInputException;
public class MathApplication {
private CalculatorService service;
	
	
	public MathApplication(CalculatorService service) {
		super();
		this.service=service;
	}
	public int addition(int number1,int number2) {
		return service.addition(number1,number2);
	}
	
	
	public int substraction(int number1,int number2) {
		return service.substraction(number1,number2);
	}
	
	public int multiplicaion(int number1,int number2) {
		return service.multiplication(number1,number2);
	}
	public int division(int number1,int number2) {
		return service.division(number1, number2);
	}
	public long factorial(int number) throws InvalidInputException {
		return service.factorial(number);
		
	}
	public long square(int number) throws InvalidInputException {

	return service.factorial(number);
	}
	 
	
	
}
		
		
		 
		
	 


