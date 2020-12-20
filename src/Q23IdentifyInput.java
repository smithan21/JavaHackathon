import java.util.Scanner;

public class Q23IdentifyInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Provide desired input");
		input.close();
		
		if (input.hasNextInt())
			System.out.println("Input is type Integer");
		else if (input.hasNextBoolean())
			System.out.println("Input is type Boolean");
		else if (input.hasNext())
			System.out.println("Input is type String");
	}

}
