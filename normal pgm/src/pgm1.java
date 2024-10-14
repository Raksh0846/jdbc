
import java.io.*; 
import java.util.*; 
class pgm1{ 
	public static void findFrequencies(int[] ele, int n) 
	{
		int freq=1;
		int indx=1;
		int element=ele[0];
		while(indx<n) {
			if(ele[indx-1]==ele[indx]) {
				freq++;
				indx++;
			}
			else {
				System.out.println(element+" "+freq);
				element=ele[indx];
				indx++;
				freq=1;
			}
		}
			System.out.println(freq);
		}
	

	// Driver code 
	public static void main(String[] args) 
	{ 

		System.out.println( 
			"---frequencies in a sorted array----"); 
		int[] arr = { 10, 20, 30, 30, 30, 40, 
					50, 50, 50, 50, 70 }; 
		int n = arr.length; 
 
		findFrequencies(arr, n); 
	} 
} 