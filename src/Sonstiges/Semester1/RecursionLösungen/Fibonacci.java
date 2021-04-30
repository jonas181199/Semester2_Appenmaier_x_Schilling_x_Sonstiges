package Sonstiges.Semester1.RecursionLösungen;

public class Fibonacci {
	public static void main(String[] args) {
		new Fibonacci().printFibonacciSequence(0, 1);
		
		
		System.out.println(new Fibonacci().getFibonacciNumberAt(20));
	}

	public void printFibonacciSequence(int fiboPrevious, int fiboCurrent) {
		System.out.print(fiboCurrent);

		if (fiboCurrent < 10000) {
			System.out.print(", ");
			// In the next method call, the current fibo number becomes the previous one and the next fiboCurrent is calculated by adding the current to the previous number
			printFibonacciSequence(fiboCurrent, fiboPrevious + fiboCurrent);
		}
	}

	
	public int getFibonacciNumberAt(int position) {
		// The 0th Sonstiges.Semester1.RecursionLösungen.Fibonacci number is 0
		if (position == 0) {
			return 0;
		// The 1st Sonstiges.Semester1.RecursionLösungen.Fibonacci number is 1
		} else if (position == 1) {
			return 1;
		} else {
			// All other Sonstiges.Semester1.RecursionLösungen.Fibonacci numbers are calculated by adding the previous number to the one before it (one and two positions further back, respectively)
			return getFibonacciNumberAt(position - 1) + getFibonacciNumberAt(position - 2);
		}
	}
}
