package practiceJavaProgram;

public class ClassStaticAndNonStatic 
{
	 int empId;
     String empName;
     int empSalary;
     static String companyName;	
     
     public  ClassStaticAndNonStatic(String a)
     {
	   	  empId =100;
	   	  empName = "Akshay";
	   	  empSalary = 50000;
	   	  companyName = "Velocity";
     }
	
     
     public  ClassStaticAndNonStatic(int a)
     {
	   	  empId =200;
	   	  empName = "Rahul";
	   	  empSalary = 60000;
	   	  companyName = "Velocity";
     }
     
     
     public ClassStaticAndNonStatic(char c)
     {
    	 empId =200;
	     empName = "Vishal";
	     empSalary = 70000;
	   	 companyName = "Velocity";
     }
	
     
     void empData()
     {
    	 System.out.println(companyName+"empID "+empId + " empName "+empName+"empSalary"+empSalary);
     }
	
		public static void main(String[] args) 
		{
			ClassStaticAndNonStatic x = new ClassStaticAndNonStatic("akshay");
			x.empData();
			
			ClassStaticAndNonStatic y = new ClassStaticAndNonStatic(1);
			y.empData();
	
			ClassStaticAndNonStatic c = new ClassStaticAndNonStatic('c');
			c.empData();
	
		
		
	}


}
