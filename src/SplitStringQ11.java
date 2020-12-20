
public class SplitStringQ11 {

	public static void main(String[] args) {

		 String str = "a, b, c, d";
		    String[] arrSplit = str.split(", ", 2);
		    for (int i=0; i < arrSplit.length; i++)
		    {
		      System.out.println(arrSplit[i]);
		    }


	}

}
