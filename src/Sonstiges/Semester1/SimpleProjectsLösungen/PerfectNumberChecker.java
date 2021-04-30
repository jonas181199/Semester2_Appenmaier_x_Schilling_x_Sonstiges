

public class PerfectNumberChecker {

	public static void main(String[] args) {
		PerfectNumberChecker perfectNumberChecker = new PerfectNumberChecker();

		for (int i = 1; i < 30; i++) {
			if (perfectNumberChecker.isPerfectNumber(i)) {
				System.out.println(i + " is a perfect number");
			} else {
				System.out.println(i + " is not a perfect number");
			}
		}
	}

	public boolean isPerfectNumber(int number) {
		// ToDo: implement a perfect number check and replace below return statement
		int summe = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				summe = summe + i;
			}
		}
		if (summe == number) {
			return true;
		} else {
			return false;
		}
	}
}