package collection;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) 
	{
		
//		HashSet<String> set= new HashSet<>();
//		
//		set.add("Priyanka");
//		set.add("Priyanka");  	//Unique data constraint will be considered here in Hash Set
//		set.add("Nilima");
//		set.add("Lokesh");
//		set.add("abc");
//		
//		
//		for (String s:set) 
//		{
//			
//			System.out.println(s);
//		}
		
		
		
//	LinkedHashSet<String> set2= new LinkedHashSet<>();
//		
//		set2.add("Priyanka");
//		set2.add("Priyanka");  	//Sequence will come as it is
//		set2.add("Nilima");
//		set2.add("Lokesh");
//		set2.add("abc");
//		
//		
//		for (String s:set2) 
//		{
//			
//			System.out.println(s);
//		}
		
		
		
	TreeSet<String> set3= new TreeSet<>();
		
		set3.add("Priyanka");
		set3.add("Priyanka");  	//Here sorting will happen. small abc will come last
		set3.add("Nilima");
		set3.add("Lokesh");
		set3.add("abc");
		
		
		for (String s:set3) 
		{
			
			System.out.println(s);
		}
		
	}

}
