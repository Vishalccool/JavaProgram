package ArrayProgram;
//8.Program to Print Odd and Even Numbers from an array
public class Program8 
{
	public static void main(String args[])
	{  
		int a[]={1,2,5,6,3,2};  
		System.out.println("Odd Numbers:");  
		
		for(int i=0;i<a.length;i++)
	{  
		if(a[i]%2!=0)
		{  
		System.out.println(a[i]);  
		}  
	}  
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length;i++)
	{   
		if(a[i]%2==0)
		{  
		System.out.println(a[i]);  
		}  
	}  
		// program 3 even position elements
		
				int v [] = {1, 2, 3, 4, 5};
				//          0  1  2  3  4
				
				System.out.println("even position elements");
				
				for(int i=0; i<v.length; i=i+2)			//i=0
				{
					System.out.println(v[i]);
				}

		//Program 4 odd position elements

				System.out.println("odd position elements");
				
				for(int i=1; i<v.length; i=i+2)       //i=1
				{
					System.out.println(v[i]);
				}  
					System.out.println();
	}

	
}
