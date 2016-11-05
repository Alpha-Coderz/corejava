package array_list;

import java.util.ArrayList;

public class Usingforeach {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ArrayList<String> ar1=new ArrayList<String>();
		ar.add("Anuj");
		ar.add("Raval");
		ar.addAll(ar1);
		for (String obj : ar) {
		System.out.println(obj);
	}
	}

}
