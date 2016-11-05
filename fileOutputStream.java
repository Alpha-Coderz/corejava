package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("NEW.txt");
		String s1 = "YO Waddup?";
		byte[] b=s1.getBytes();
		fos.write(b);
		System.out.println("File creation success Exiting ...");
		}

}
