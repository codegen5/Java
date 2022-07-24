/*
 * The sum of the squares of the first ten natural numbers is 385,
 * 
 * The square of the sum of the first ten natural numbers is 3025,
 * 
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
 * 3025-385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class P006 {

	public static void main(String[] args) {
		int number = 100;
		int sum = 0;

		for (int i = 1; i <= number; i++) {
			sum = sum + (i * i);
		}
		number = number * (number + 1) / 2;
		number = number * number;
		System.out.println(number - sum);
	}
}
