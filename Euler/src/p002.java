import java.util.Iterator;

public class p002 {

	public static void main(String[] args) {
		int sum = 0;
		int x = 1;
		int y = 2;
		while (x <= 4000000) {
			if (x % 2 == 0)
				sum += x;
			int z = x + y;
			x = y;
			y = z;

		}
		System.out.println(sum);

	}

}
