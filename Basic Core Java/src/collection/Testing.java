package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Testing {

	public static void main(String[] args) 
	{
		
		ArrayList<String> stds=new ArrayList<>();
		
		stds.add("Anand");
		stds.add("abc");
		stds.add("xyz");			
		
		LinkedList<String> stds1=new LinkedList<>();
		
		stds1.add("uvw");
		stds1.add("opq");
		stds1.add("ase");		
		
		Vector<String> stds2=new Vector<>();
		
		stds2.add("Anil");
		stds2.add("Rajat");
		stds2.add("Jyoti");
		
		
		for (String s:stds2)    //syntax for array
		{
			System.out.println(s);
		}
		
		
		
		
	}

}
