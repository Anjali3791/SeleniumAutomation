package collection;

import java.util.HashMap;
import java.util.Hashtable;

public class MapInterface {

	public static void main(String[] args) 
	{

		HashMap<String, String> map= new HashMap<String, String>();
		
		map.put("name", "Anjali");
		map.put("surname", "abc");
		map.put(null, "XYZ");
		
		System.out.println(map.get(null));
		
		
		Hashtable<String, String> map2= new Hashtable<String, String>();
		
		map2.put("name", "Anjali");
		map2.put("surname", "abc");
		map2.put(null , "ACC");
		
		System.out.println(map.get(null));
		
	}

}
