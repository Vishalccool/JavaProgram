package ArrayProgram;
//7.Program to sort the elements of an array in descending order
public class Program7 
{
	public static void main(String[] args)
	{        
        //Initialize array     
        int [] arr = new int [] {50, 23, 78, 87, 11};     
        int temp = 0;  
        for (int i = 0; i < arr.length; i++)
        {     
            for (int j = i+1; j < arr.length; j++) 
            {     
               if(arr[i] < arr[j]) 
               {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
            
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in descending order: ");    
        for (int i = 0; i < arr.length; i++)
        {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}
