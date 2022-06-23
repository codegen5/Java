import java.util.Scanner;

public class Java1 {

	public static void main(String[] args) {
		String myName = "taha";
		System.out.println(myName);
		myName = "ee nes";
		System.out.println(myName);
		int myAge = 28;
		System.out.println(myAge);
		int hisAge = 28;
		System.out.println(hisAge);
		System.out.println("Sum of Ages = "+myAge + hisAge);
		boolean x = myAge==hisAge;
		System.out.println(x);
		
		Scanner scanner = new Scanner(System.in);
		int myInput = scanner.nextInt();
		
		
		//if
//		String operator = "+"
		if (myInput>18) {
			System.out.println(myInput + " is greater than 18");
		}
		else if (myInput == 18) {
			System.out.println(myInput + " is equal to 18");
		}
		else {
			System.out.println(myInput + " is less than 18");
		}

	}

}
