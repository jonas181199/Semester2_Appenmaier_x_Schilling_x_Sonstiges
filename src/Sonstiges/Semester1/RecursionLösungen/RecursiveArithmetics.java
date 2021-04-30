package Sonstiges.Semester1.RecursionLösungen;

public class RecursiveArithmetics {
	
	// Works only for natural numbers
	public int add(int a, int b) {
		if(b == 0) {
			return a;
		} else {
			return add(a + 1, b - 1);
		}
	}

	// Works only for natural numbers
	public int subtract(int a, int b) {
		if(b == 0) {
			return a;
		} else {
			return subtract(a - 1, b - 1);
		}
	}
	
	
	public int multiply(int a, int b) {
		// Using c=0 as the base case (anything times 0 is 0)
		return multiply(a, b, 0);
	}
	
	private int multiply(int a, int b, int c) {
		// If the second factor is 0 return c (with base case c=0)
		if (b == 0) {
			return c;
		} else {
			// Otherwise return a + (a * [b - 1])
			return multiply(a, b - 1, c + a);
		}
	}
	
	
	public int divide(int a, int b) {
		// Using c=0 as the base case (whenever a < b => a / b = 0)
		return divide(a, b, 0);
	}
	
	private int divide(int a, int b, int c) {
		// When the divisor is bigger than the dividend, return c (with base case c=0)
		if (b > a) {
			return c;
		} else {
			// Otherwise return 1 + ([a - b] / b)
			return divide(a - b, b, c + 1);
		}
	}
}
