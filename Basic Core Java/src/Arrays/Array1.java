package Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = new String [4];
		
		str [0] = "Swapnil";
		str [1] = "Pradnya";
		str [2] = "Anjali";
		str [3] = "Roopali";
		
		//System.out.println(str[3]);
		//System.out.println(str.length);
		
		//LOOPS
		
		/*
		 * for(int i=0 ; i<str.length; i++) { System.out.println(str[i]); }
		 */	
		
		//Enhanced for loop
		
		for (String s:str)
		{
			System.out.println(s);
		}
		

	}

}
