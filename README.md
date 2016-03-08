# corejava
Get started with JAVA


Here we will discuss some basics topics related to Java.

    Where to download Java.
    How to install Java.
    Setting up the Environment Variables.
    Our First Java Program.
    How to compile a Java application.
    How to run a Java Application.
    Difference between important terms in Java (JDK vs JRE or J2SE vs J2EE..).

 

 
How to Download Java

Latest version of Java can be downloaded from Java Website.--->http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

 
Java Installation

Once java is downloaded, it can be installed like any other software (.exe) in your Windows system.

 
Setting up the Environment Variables

After installing Java there are some environment variables that need to be set.

    CLASSPATH : This environment variable points to the location of JDK home directory. It also contains the address of folder from where jars get loaded by ClassLoader (For more details of ClassLoader visit here)
    JAVA_HOME : This environment variable will point to the location of Java home directory.

How to set environment variable in different platforms

Windows XP

To set up environment variables in Windows XP right click on the “My Computer” icon and select Properties. In the  Property window select the “ADVANCED”  tab and click on “ENVIRONMENT VARIABLES” . A window will appear were you can enter a new environment variable under System Variables by selecting New button.

Windows Vista / 7

To set up environment variables in Windows Vista / 7  right click  on “Computer” and select Properties. In  Property window select  “ADVANCED SYSTEM SETTINGS” and then select “ADVANCED” tab and click “ENVIRONMENT VARIABLES”. A window will appear were you can enter new environment variable under User/System Variables by selecting New button.

 
How to Check if Java is Installed

To check if your java is installed properly open Command Prompt . To open command prompt write “CMD” in run command and hit enter. In the command prompt window write “java -version“.  If your java is installed properly and all environment variables are configured correctly it will show the version of Java installed . Information reflected on the command prompt will be like

1
2
3
4
	
C:\Users\Jbt>java -version
java version "1.8.0_51"
Java(TM) SE Runtime Environment (build 1.8.0_51-b16)
Java HotSpot(TM) Client VM (build 25.51-b03, mixed mode, sharing)

If there is any problem while installing or in setting up the environment variable, output on command prompt will be like

1
2
	
'java' is not recognized as an internal or external command,
operable program or batch file.

 
How to check if Java is up to date

To know if the Java installed on your system is up to date or not Click Here.

 
Our First Java Program

It is very common to write first Java as ” Hello World !! ” . But here we will write a program to print ” Hello JBT !! “. :)

If everything till now was configured properly then we can start writing our first application. Open any editor and write the below code.
1
2
3
4
5
	
public class FirstProgramme {
	public static void main(String args[]) {
		System.out.println("Hello JBT!");
	}
}

Once done save the file with the name “FirstProgramme.java” in folder “c:\jbt”. Please note that name of the file should be same as the name given to public class(For more details regarding class file rules click here). Once file is saved, open command prompt and change its current directory to “c:\jbt”, where file is saved with the help of cd command. And fire “javac” command which is used to compile the java code as below.

1
2
3
4
5
	
C:\Users\JBT>cd C:JBT
 
C:JBT>javac FirstProgramme.java
 
C:JBT>

If the java file is compiled properly compiler will create a class file for java source. It will be saved in the same location as the source file. Since there is no package declared in the given code so the .class file will be created in the same folder location.

But steps will be different for java files  using package declaration. Let’s create a Java file as below.

1
2
3
4
5
6
7
	
package com.jbt;
 
public class FirstProgrammeWithPackage {
   public static void main(String args[]) {
   System.out.println("Hello JBT!");
  }
}

save this file with name as “FirstProgrammeWithPackage.java” @ “c:\jbt”. Now go to command prompt and execute below command.
1
	
javac -d . FirstProgrammeWithPackage.java

It will create class file in corresponding package(com.jbt).  So now you know how to compile Java file with package and without package. Next step would be run these class files.

 

 
How to Run Java Application

Now that your  java file is compiled we can execute the application with the help of “java” command as below .

Without Package
1
2
3
4
	
C:\JBT>java FirstProgramme
Hello JBT!
 
C:\JBT>

With Package

1
2
	
C:\JBT>java com.jbt.FirstProgrammeWithPackage
Hello JBT!

Or
1
2
	
C:\JBT>java com/jbt/FirstProgrammeWithPackage
Hello JBT!

 

Note*: For “java” command we use class file name without its extension(.class),
With this we are done with creating and running our very first Java application.
Bingo !!

