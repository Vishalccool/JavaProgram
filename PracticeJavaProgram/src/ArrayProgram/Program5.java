package ArrayProgram;
//5.Program to print the largest element in an array
public class Program5 {

	public static void main(String[] args) 
	{
		int []a = new int [] {25,30,72,-10,62,85};
		int max = a[0];
		
		for (int i=0; i<a.length; i++)
		{ 
	// compare elements of array with max		
			if (a[i]>max)
				max=a[i];
		}
	System.out.println("Largest element present in given array: " + max);
	}
	

}
