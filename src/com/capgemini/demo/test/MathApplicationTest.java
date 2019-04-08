package com.capgemini.demo.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.capgemini.demo.MathApplication;
import com.capgemini.demo.service.CalculatorService;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {

	@Mock
	private CalculatorService service;

	@InjectMocks
	MathApplication application = new MathApplication(service);

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testPerformAdditionWithTwoPositiveIntegers() {
		when(service.addition(6, 4)).thenReturn(10);
		assertEquals(10, application.addition(6, 4));
	}

	@Test
	public void testFindFactorialWithPositiveInteger() throws InvalidInputException {
		when(service.factorial(5)).thenReturn(120L);
		assertEquals(120, application.factorial(5));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testPerformDivisionWithDivisorZero() {
		doThrow(new ArithmeticException("/ by zero")).when(service).division(10, 0);
		 application.division(10, 0);
	}
	
	
	@Test
	public void testFindperformSubstractionWithPositiveIntegers() {
		when(service.substraction(6,3)).thenReturn(3);
		assertEquals(3, application.substraction(6,3));
	}
	
	
	@Test
	public void testPerformAdditionWithTwoNegativeIntegers() {
		when(service.addition(-2,-4)).thenReturn(-6);
		assertEquals(-6, application.addition(-2, -4));
	}
	
	 
	@Test
	public void testPerformAdditionWithPositiveNegativeIntegers() {
		when(service.addition(-2,4)).thenReturn(2);
		assertEquals(2, application.addition(-2, 4));
	}
	@Test
	public void testPerformSubstractionWithTwoNegativeIntegers() {
		when(service.substraction(-2,-4)).thenReturn(-2);
		assertEquals(-2, application.substraction(-2, -4));
	}
	
	@Test
	public void testPerformSubstractionWithPositiveNegativeIntegers() {
		when(service.substraction(-2,4)).thenReturn(-6);
		assertEquals(-6, application.substraction(-2, 4));
	}
	
	@Test
	public void testPerformMultiplicationWithPositiveNegativeIntegers() {
		when(service.multiplication(-2,4)).thenReturn(-8);
		assertEquals(-8, application.multiplicaion(-2, 4));
	}
	
	@Test
	public void testPerformMultiplicationWithTwoPositiveIntegers() {
		when(service.multiplication(2,4)).thenReturn(8);
		assertEquals(8, application.multiplicaion(2, 4));
	}
	
	@Test
	public void testPerformMultiplicationWithTwoNegativeIntegers() {
		when(service.multiplication(-2,-4)).thenReturn(-8);
		assertEquals(-8, application.multiplicaion(-2, -4));
	}
	
	
	@Test
	public void testPerformDivisionWithTwoNegativeIntegers() {
		when(service.division(-8,-2)).thenReturn(4);
		assertEquals(4, application.division(-8, -2));
	}
	@Test
	public void testPerformDivisionWithTwopositiveIntegers() {
		when(service.division(8,2)).thenReturn(4);
		assertEquals(4, application.division(8,2));
	}
	
	@Test
	public void testPerformDivisionWithPositiveNegativeIntegers() {
		when(service.division(-8,2)).thenReturn(-4);
		assertEquals(-4, application.division(-8,2));
	}
	
	
	@Test
	public void testPerformDivisionWithNegativePositiveIntegers() {
		when(service.division(8,-2)).thenReturn(-4);
		assertEquals(-4, application.division(8,-2));
	}
	
	@Test(expected = InvalidInputException.class) 
	public void testFindFactorialWithNegativeInteger() throws InvalidInputException {
		doThrow(new InvalidInputException("invalid  input")).when(service).factorial(-5);
		application.factorial(-5);
		 
	}
	@Test
	public void testPerformSquareWithTwopositiveIntegers() {	when(service.square(4,2).thenReturn(4);
		assertEquals(4, application.division(8,2));
	}
	
	

}
