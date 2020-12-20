import java.util.Scanner;

public class Q1Boolean {

public static void main(String[] args) {
	
	    boolean x;
	    boolean y;
	    boolean z;
	    boolean result;

	    Scanner b = new Scanner(System.in);
	    System.out.print("Enter first boolean value: ");
	    x = b.nextBoolean();

	    System.out.print("Enter second boolean value: ");
	    y = b.nextBoolean();

	    System.out.print("Enter third boolean value: ");
	    z = b.nextBoolean();

	   b.close();
	   
	    if(x) {

	      result = y || z;
	    }
	    else {

	      result = y && z;
	    }

	    if(result) {
	      System.out.println("Two boolean variables are true.");
	    }
	    else {
	      System.out.println("Two boolean variables are not true.");
	    }
}
}