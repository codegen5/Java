import java.util.Objects;
import java.util.Scanner;

public class MarcoPolo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = scanner.next();
		scanner.close();
		
		if (name.equalsIgnoreCase("marco")) {
			System.out.println("Polo!");
		}
			else {
				System.out.println("Hello " + name +"!");
			
		}
			
		
		

	}

}
