import java.util.Scanner;

public class FactorialRecurQ28 {
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		int factorial = fact(num);
		System.out.println("Factorial of "+num+" is: "+factorial);
		s.close();
	}
	static int fact(int a) {
	if (a>=1)
		return a*fact(a-1);
	else
		return 1;
	}
}
