package FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileInputStream extends fileOutputStream {

	public static void main(String args []) throws IOException{
	
		FileInputStream fis = new FileInputStream("NEW.txt");
		 int i=0;  
		    while((i=fis.read())!=-1){  
		     System.out.println((char)i);  
		    }  
		    fis.close();  
	}


}



