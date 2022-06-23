
public class p005 {

	public static void main(String[] args) {
		int sayi = 2;
		int y = 0;
		int i = 1;
		for (int x = 1; x <= 20; x++) {
			i = x;
			while (sayi % i != 0)
				for (int j = 2; j < i; j++) {
					while (i % j == 0 && i != j)
						i /= j;

					y = i;

					sayi = sayi * y;
					break;
				}

		}
		System.out.println(sayi);
	}

}
