import java.util.Scanner;

public class ReverseStringQ13 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str = s.nextLine();
		 s.close();
		 
		System.out.print("the reverse of given string is: ");
		
		for(int i=str.length(); i>0; --i)    {

			System.out.print(str.charAt(i-1));      
       
			}
	}

}
