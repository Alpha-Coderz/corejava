package array_list;
import java.util.*;

public class Arraylist {

			public static void main(String[] args) {
					ArrayList<String> a1=new ArrayList<String>();
				//	a1.add(2496, 0);
					a1.add("Nuj");
					a1.add("ARaval");
					a1.add("Yo");
					a1.add(String.valueOf("Sort"));
					Collections.sort(a1);
					Iterator i1=a1.iterator();
					while (i1.hasNext()){
						System.out.println(i1.next());
				}	
			}
}