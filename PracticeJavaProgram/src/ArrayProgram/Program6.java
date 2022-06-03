package ArrayProgram;
//6.Program to sort the elements of an array in ascending order
public class Program6 
{

	public static void main(String[] args) 
	{
		int [] a= {5,20,25,60,80,2,45};
		 
		int min, temp=0;
		for (int i=0;i<a.length; i++)
		{
			min =i;
			for (int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}			
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
				

	}

}
