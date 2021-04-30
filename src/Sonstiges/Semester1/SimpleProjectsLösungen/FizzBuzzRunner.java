
public class FizzBuzzRunner {

	public static void main(String[] args) {

		FizzBuzzRunner fizzBuzzRunner = new FizzBuzzRunner();

		for (int i = 1; i < 30; i++) {
			System.out.println(fizzBuzzRunner.fizzBuzz(i));
		}
	}

	public String fizzBuzz(int number) {
		if (number % 3 == 0 && number % 5 == 0) {
			return "FizzBuzz";
		} else if (number % 3 == 0) {
			return "Fizz";
		} else if (number % 5 == 0) {
			return "Buzz";
		} else {
			return String.valueOf(number); // return nicht möglich, da zahl ein int wäre
		}

	}
}
