package stringClass;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//Assignment:  to find number of 'a' in anand string
		
				String str9 = "ananda";
				String str10 = str9.replace("d","");
				String str11 = str10.replace("n","");
				int l = str11.length();
				System.out.println(l);
				
		//Sir Solution
				
				String str = "anand";
				System.out.println(str.length());
				String str2 = str.replace("a", "");
				System.out.println(str2.length());
				System.out.println(str.length()-str2.length());
				
		//In one line
				
			System.out.println(str.length()-(str.replace("a", "")).length());
			*/
			
		//Loop solution
			
	String str4= "anand";
	
	int count=0;
	for(int i = 0; i<str4.length();i++)
	{
		if(str4.charAt(i)=='a')
		{
			count++;
			
		}
		
	}
	System.out.println(count);
	}

}
