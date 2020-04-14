package javaExceptionHandling;

import java.io.File;
import java.io.FileInputStream;

public class FinallyBlock {

	public static void main(String[] args) {

		String filepath="D:\\Test.txt";
		
		File file=new File(filepath);
		try {
		
		FileInputStream fis=new FileInputStream(file);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
		
		System.out.println("After Checked Exception");
		}
		
		
}

}
