package stringexample;

public class Stringclass  {
		public static void main (String args[]){
		String s1="Anuj";
		String s2="Raval";
		String s3="ANUJ";
		String s="Anuj";
		String s4="   Anuj  ";
		String s5=new String ("Yeah");
		String s6=s5.intern();
		String name = " yo bitch whatsapp man ";
		String ss="kava is oop language";
		System.out.println("String equality : "+s1.equals(s3));	
		System.out.println("String equality  : "+s.equals(s));
		System.out.println("Case sensitive " +s.equalsIgnoreCase(s3));
		System.out.println("CompareTo:"+s.compareTo(s3));
		System.out.println("Concat" +s.concat(s2));
		System.out.println("Upper case" +s.toUpperCase());
		System.out.println("Lower case" +s3.toLowerCase());
		System.out.println("Trim" +s4.trim());
		System.out.println("Start with string" +s3.startsWith("AN"));
		System.out.println("End with string" +s3.endsWith("J"));
		System.out.println("Char At" +s.charAt(3));
		System.out.println("String length" +s3.length());
		System.out.println("Intern" +s6.intern());
		System.out.println("String length" +s.length());
		System.out.println(ss.replace("kava", "java"));
		System.out.println(name.contains("yo"));
		System.out.println(name.contains("alright"));
	}
}
