/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 * */

public class P007 {

	public static void main(String[] args) {
		int i, flag = 1;

		for (i = 3; flag < 10001; i += 2) {

			for (int y = 3; y <= i; y += 2) {

				if (i % y == 0 && i != y) {
					break;
				} else if (i == y) {
					flag++;
				}
			}
		}
		System.out.println(i - 2);
	}
}