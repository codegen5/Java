import java.util.Objects;
import java.util.Scanner;

public class CalculatorV2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("First number: ");
		double operand1 = scanner.nextDouble();
		System.out.print("Operator: ");
		String operator = scanner.next();
		System.out.print("Second number: ");
		String operand2 = scanner.next();
		
		scanner.close();
		
		int intOperand2 = Integer.parseInt(operand2);
		
		if (Objects.equals("+", operator)) {
			System.out.print("The result is " + (operand1 + intOperand2));
		}
		else if (Objects.equals("-", operator)) {
			System.out.print("The result is " + (operand1 - intOperand2));
		}	
		else if (Objects.equals("/", operator)) {
			System.out.print("The result is " + (operand1 / intOperand2));
		}
		else if (Objects.equals("*", operator)) {
			System.out.print("The result is " + (operand1 * intOperand2));
		} else {
			System.out.println("'" + operator + "'"+ " is not a defined operator. Defined operators are '+', '-', '/', '*'.");
		}
		

	}

}
