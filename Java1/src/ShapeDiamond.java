import java.util.Scanner;

public class ShapeDiamond {

	public static void main(String[] args) {

		int row, space, x = 1;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		row = sc.nextInt();
		sc.close();

		space = row - 1;

		// for number of rows expanding
		for (int i = 0; i < row; i++) {
			// print required amount of spaces before blocks
			for (int y = 0; y < space; y++) {
				System.out.print(" ");
			}
			// print required amount of asterisk blocks
			for (int z = 0; z < x; z++) {
				System.out.print("*");
			}
			// print new line after each row
			System.out.println();
			space--;
			x += 2;
		}

		space = 1;

		// for number of rows dwindling
		for (int j = 1; j < row; j++) {
			// print required amount of spaces before blocks
			for (int p = 0; p < space; p++) {
				System.out.print(" ");
			}
			// print required amount of asterisk blocks
			for (int v = 4; v < x; v++) {
				System.out.print("*");
			}
			// print new line after each row
			System.out.println();
			space++;
			x -= 2;
		}
	}
}
