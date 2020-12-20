
public class ReverseArrayQ62 {

	
static void reverse(int arr[], int n, int k)
{
	for (int i = 0; i < n; i += k)
	{
		int l = i;
		int r = Math.min(i+k-1, n-1);
		int j; 
		
		while(l < r)
		{
			j = arr[l];
			arr[l] = arr[r];
			arr[r] = j;
			l += 1;
			r -= 1;
		}
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {3,2,4,7,0,3,1,5,8,4};
		int k =3;
		
		int n = arr.length;
		
		reverse(arr, n, k);
		
		for (int i = 0; i < n; i++)
			System.out.print(arr[i]);
	}
}