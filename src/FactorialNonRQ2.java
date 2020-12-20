import java.util.Scanner;

public class FactorialNonRQ2 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		s.close();
		
		int factorial = 1;
		
		for(int i =1; i<=num; i++) {
			factorial = factorial*i;
		}
		System.out.println("Factorial of "+num+" is: "+factorial);
		
	}

}
