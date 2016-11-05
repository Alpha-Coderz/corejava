package FileIO;
import java.io.*;
public class sequenceInputStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("New.txt");  
		   FileInputStream fis2 = new FileInputStream("new.txt");  
		  
		   SequenceInputStream sis1=new SequenceInputStream(fis1,fis2);  
		   int i;  
		   while((i=sis1.read())!=-1){  
		    System.out.println((char)i);  
		   }  
		   sis1	.close();  
		   fis1.close();  
		   fis2.close();  
		  }  
		
	}

