package stringexample;

public class Stringbuffer {
	
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("JAVA");
		sb.append(" IS OOP LANGUAGE");
		System.out.println("Append String :"+sb);
		sb.insert(1,"hello");
		System.out.println("Insert String :"+sb);
		sb.replace(1,3, "kava");
		System.out.println("Replace String :"+sb);
		sb.reverse();
		System.out.println("Reverse String :"+sb);		
		
	}
}

	
	
		
