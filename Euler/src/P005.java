/*
* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
*
* What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class P005 {

	public static void main(String[] args) {
		int number = 2;

		for (int x = 3; x <= 20; x++) {
			if (number % x != 0) {
				for (int y = 2; y <= x; y++) {
					int testNumber = y * number;

					if (testNumber % x == 0) {
						number = testNumber;
						break;
					}
				}
			}
		}
		System.out.println(number);
	}
}