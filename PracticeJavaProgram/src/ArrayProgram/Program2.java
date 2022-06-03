package ArrayProgram;
// 2.Program to print the elements of an array in reverse order
public class Program2 {

	public static void main(String[] args)
	{

		int x [] = {1, 2, 3, 4, 5};
		for(int i=x.length-1; i>=0; i--)
		{
			System.out.println(x[i]);
		}
	}

}
