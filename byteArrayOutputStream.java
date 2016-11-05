package FileIO;

import java.io.*;
import java.io.ByteArrayOutputStream;

public class byteArrayOutputStream {


	public static void main(String[] args) throws IOException {
			
		FileOutputStream fos = new FileOutputStream("New.txt");
		FileOutputStream fos1 = new FileOutputStream("new.txt");
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
	
		bos.write(2496);
		bos.writeTo(fos1);
		bos.writeTo(fos);
		
		bos.flush();
		bos.close();
		System.out.println("Byte array output operation success ");
		
		FileInputStream fin = new FileInputStream("New.txt");
		 int i=0;  
		    while((i=fin.read())!=-1){  
		     System.out.println((char)i);  
		    }  
		    fin.close();  
	
	}
}