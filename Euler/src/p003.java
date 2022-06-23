/*
* The prime factors of 13195 are 5, 7, 13 and 29.
*
* What is the largest prime factor of the number 600851475143 ?
*/

public class p003 {

	public static void main(String[] args) {
		long n = 600851475143L;

		for (long m = 2; m <= n; m++) {
			if (n % m == 0) {

				n /= m;

				if (n == 1) {
					System.out.println(m);
				}
			}
		}
	}
}