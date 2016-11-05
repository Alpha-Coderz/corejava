package com.soc.chat;
import java.net.*;  
import java.io.*;  

public class Client {

	public static void main(String args[])throws IOException{  
				
				Socket s2=new Socket("localhost",3333);  
				
				DataInputStream din=new DataInputStream(s2.getInputStream());  
				
				DataOutputStream dout=new DataOutputStream(s2.getOutputStream());  
				
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
					String str="",str2="";  
					while(!str.equals("stop")){  
					str=br.readLine();  
					dout.writeUTF(str);  
					dout.flush();  
					str2=din.readUTF();  
					System.out.println("Server says: "+str2);  
					}  
  
						dout.close();  
						s2.close();  
				}
	} 


