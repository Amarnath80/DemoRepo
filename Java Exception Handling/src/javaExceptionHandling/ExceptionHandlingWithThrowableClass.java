package javaExceptionHandling;

public class ExceptionHandlingWithThrowableClass {

	public static void main(String[] args) {

		int a=10;
		try
		{
			a=a/0;
		}
		catch(Throwable e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("After Exception");
	}

}
