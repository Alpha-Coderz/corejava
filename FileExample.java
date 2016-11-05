package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		File file = new File("abc1.txt");
		file.createNewFile();
		System.out.println("file:"+file);
		FileOutputStream fos = new FileOutputStream("");
		FileInputStream fis = new FileInputStream("");
	}

}
