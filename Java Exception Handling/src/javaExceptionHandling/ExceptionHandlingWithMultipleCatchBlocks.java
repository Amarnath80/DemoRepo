package javaExceptionHandling;

public class ExceptionHandlingWithMultipleCatchBlocks {
	
	public static void main(String args[])
	{
		int a=10;
		int[] b= {1,2,3};
		
		try
		{
			
			a=a/0;
			System.out.println(b[6]);
			
			a=a/0;
			
		}
		
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		catch(ArrayIndexOutOfBoundsException e1)
		{
			e1.printStackTrace();
		}
		
		System.out.println("After Exception");
	}

}
