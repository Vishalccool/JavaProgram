package practiceJavaProgram;

public class DisplayPrimeNo 
{
	public static void main(String[] args) 
	{
		int a = 3;
		int b = 0;		
		if (a>1)
		{
			for (int i=1; i<=a; i++)
			{
				if(a%1==0)
					b++;
			}
				if(b==2)
				{
					System.out.println("Prime Number");
				}
				else
				{
					System.out.println("Not Prime Number");
				}
				
		}
	}
}
