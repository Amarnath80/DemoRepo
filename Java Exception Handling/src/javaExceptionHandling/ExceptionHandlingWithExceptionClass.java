package javaExceptionHandling;

public class ExceptionHandlingWithExceptionClass {

	public static void main(String[] args) {

		int a=10;
		try
		{
			a=a/0;
		}
		catch(Exception b)
		{
			System.out.println(b);
		}
		System.out.println("After Exception Handled");
	}

}
