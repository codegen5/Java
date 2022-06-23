/*
* A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
*
* Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class p004 {

	public static void main(String[] args) {
		int palindrome = 0;

		for (int i = 999; i > 99; i--) {
			for (int y = 999; y > 99; y--) {
				int result = i * y;
				int inverted = 0;

				for (; result != 0; result /= 10)
					inverted = inverted * 10 + result % 10;

				if (inverted == i * y && palindrome < inverted)
					palindrome = inverted;
			}
		}
		System.out.println("Sonuç: " + palindrome);
	}
}