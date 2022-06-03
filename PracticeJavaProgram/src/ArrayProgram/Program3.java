package ArrayProgram;
// 3.Program to print the elements of an array present on even position
public class Program3 {

	public static void main(String[] args) 
	{
	 int []a= new int [] {1,2,3,4,5,6,7,8,9,10};
	 System.out.println("Elements of given array present on even position: ");
		for (int i=1;i<a.length;i=i+2)
		{
          System.out.println(a[i]);	
		}

	}

}
