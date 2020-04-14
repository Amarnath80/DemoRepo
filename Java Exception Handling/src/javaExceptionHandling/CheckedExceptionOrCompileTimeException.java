package javaExceptionHandling;

import java.io.File;
import java.io.FileInputStream;

public class CheckedExceptionOrCompileTimeException {

	public static void main(String[] args) {

			String filepath="D:\\Test.txt";
			
			File file=new File(filepath);
			FileInputStream fis=new FileInputStream(file);
			
			System.out.println("After Checked Exception");
			
			
	}

}
