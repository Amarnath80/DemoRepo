package javaExceptionHandling;

public class UnCheckedExceptionOrRunTimeException {

	public static void main(String[] args) {

		int a=10;
		
		try
		{
			a=a/0;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
