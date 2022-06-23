/*
* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
*
* What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class p005 {

	public static void main(String[] args) {
		int number = 2;
		int y = 0;
		int i = 1;

		for (int x = 1; x <= 20; x++) {
			i = x;

			while (number % i != 0) {
				
				for (int j = 2; j < i; j++) {
					
					while (i % j == 0 && i != j) {
						i /= j;
					}
					y = i;
					number = number * y;
					break;
				}
			}
		}
		System.out.println(number);
	}
}
