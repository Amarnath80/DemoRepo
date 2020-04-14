package javaExceptionHandling;

public class ExceptionHandlingWithArithmeticExceptionClass {

	public static void main(String[] args) {

		int a=10;
		try
		{
			a=a/0;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("After Exception");
	}

}
