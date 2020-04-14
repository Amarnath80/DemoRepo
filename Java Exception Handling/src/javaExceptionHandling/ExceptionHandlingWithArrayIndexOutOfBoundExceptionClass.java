package javaExceptionHandling;

public class ExceptionHandlingWithArrayIndexOutOfBoundExceptionClass {

	public static void main(String[] args) {

		int[] a= {1,2,3,4,5};
		
		try
		{
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("After Exceprtion");
	}

}
