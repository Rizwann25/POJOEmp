
class MyException extends Exception 
{ 
	public MyException(String s) 
	{ 
		
		super(s); 
	} 
} 


public class Main 
{ 
	
	public static void main(String args[]) 
	{ 
		try
		{ 
			
			throw new MyException("John, 100, 25,000"); 
		} 
		catch (MyException ex) 
		{ 
			System.out.println(" EmpName: \n "); 
			System.out.println(" EmpID: \n "); 
			System.out.println(" EmpSalary: \n "); 

			
			System.out.println(ex.getMessage()); 
		} 
	} 
} 
