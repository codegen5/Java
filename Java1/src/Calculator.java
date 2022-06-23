import java.util.Objects;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("First number: ");
		double operand1 = scanner.nextDouble();
		System.out.print("Operator: ");
		String operator = scanner.next();
		System.out.print("Second number: ");
		int operand2 = scanner.nextInt();
		scanner.close();
		
		if (Objects.equals("+", operator)) {
			System.out.print("The result is " + (operand1 + operand2));
		}
		else if (Objects.equals("-", operator)) {
			System.out.print("The result is " + (operand1 - operand2));
		}	
		else if (Objects.equals("/", operator)) {
			System.out.print("The result is " + (operand1 / operand2));
		}
		else if (Objects.equals("*", operator)) {
			System.out.print("The result is " + (operand1 * operand2));
		} else {
			System.out.println("'" + operator + "'"+ " is not a defined operator. Defined operators are '+', '-', '/', '*'.");
		}
		

	}

}
