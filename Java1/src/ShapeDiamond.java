import java.util.Scanner;

public class ShapeDiamond {

	public static void main(String[] args) {

		int row, space;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		row = sc.nextInt();
		sc.close();

		space = row;

		for (int i = 0; i < row; i++) {
			
			for (int y = 0; y < space; y++) {
				System.out.print(" ");
			}
			space--;
			
			System.out.print("*");

		}

	}

}
