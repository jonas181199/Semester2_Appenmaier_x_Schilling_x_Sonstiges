package Sonstiges.Semester1.RecursionLösungen;

public class HelloRecursion {
	
	// Iterative
	public void repeatI(int repetitions) {
		while(repetitions >= 0) {
			System.out.println("Hello " + repetitions);
			repetitions--;
		}
	}
	
	// Recursive
	public void repeatR(int repetitions) {
		System.out.println("Hello " + repetitions);
		
		if(repetitions > 0) {
			repeatR(repetitions - 1);
		}
	}
	

	public void repeat(int currentRepetition, int maxRepetitions) {
		System.out.println("Hello " + currentRepetition);
		
		// Only call the next method instance when maxRepetitions is greater than or equal to currentRepetitions
		if (currentRepetition <= maxRepetitions) {
			repeat(currentRepetition + 1, maxRepetitions);
		}
	}

}
