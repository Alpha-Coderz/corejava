package com.soc.chat;
import java.net.*;
import java.io.*;  
class MyServer{  
    public static void main(String args[])throws IOException{  
    	
    	ServerSocket ss1=new ServerSocket(3333);  
    	
    	Socket s2=ss1.accept();  
    	
    	DataInputStream din=new DataInputStream(s2.getInputStream());  
    	
    	DataOutputStream dout=new DataOutputStream(s2.getOutputStream());  
    	
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
      
    	System.out.println("Server running");
    	String str="",str2="";  
    	while(!str.equals("stop")){  
    		
    			str=din.readUTF();  
    			System.out.println("client says: "+str);  
    			str2=br.readLine();  
    			dout.writeUTF(str2);  
    			dout.flush();  
    		}  
    	din.close();  
    	s2.close();  
    	ss1.close();  
    	}
   }  

