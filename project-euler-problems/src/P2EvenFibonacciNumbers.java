/**
 * Problem 2: Even Fibonacci numbers
 * 
 * Each new term in the Fibonacci sequence is generated by adding the previous
 * two terms. By starting with 1 and 2, the first 10 terms will be:
 * 
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed
 * four million, find the sum of the even-valued terms.
 * 
 * @author Justin Stringer
 */
public class P2EvenFibonacciNumbers {

	public Long sumOfEvenFibonacciNumbersLessThanCeiling(Long ceiling) {

		if (ceiling == null) {
			return null;
		}

		Long numberBeforeLastNumber = 0l;
		Long lastNumber = 1l;
		Long currentNumber = lastNumber + numberBeforeLastNumber;
		Long sumOfEvenNumbers = 0l;

		while (currentNumber < ceiling) {
			System.out.println("currentNumber=" + currentNumber);

			if (currentNumber % 2 == 0) {
				sumOfEvenNumbers += currentNumber;
			}

			numberBeforeLastNumber = lastNumber;
			lastNumber = currentNumber;
			currentNumber = lastNumber + numberBeforeLastNumber;
		}

		return sumOfEvenNumbers;
	}
}
