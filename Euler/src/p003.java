import java.util.Iterator;

public class p003 {

	public static void main(String[] args) {
		long n = 600851475143L;
		for (long m = 2; m <= n; m++) {
			if (n % m == 0) {
				n /= m;
				if (n == 1)
					System.out.println(m);
			}
		}

	}
}
