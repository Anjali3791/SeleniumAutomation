package stringClass;

public class Str1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  String str = "Anjali Khonde";
		  
		  System.out.println(str.length());
		  
		  //Trim Function
		  
		  System.out.println(str.trim());
		  
		  //Char At
		  
		  System.out.println(str.charAt(5));
		  
		  //Sub String
		  
		  String str2 = str.substring(0, 6); System.out.println(str2);
		  
		  String str3 = str.substring(7); System.out.println(str3);
		  
		  //trim and Sub
		  
		  String str4 = " anjali ";
		  
		  String str5 = str4.trim();
		  
		  String str6= str5.substring(0);
		  
		  System.out.println(str6);
		  
		  
		  //Replace
		  
		  String str7 = str.replace(" ", ""); System.out.println(str7);
		  
		  
		  //Split
		  
		  String[] arr = str.split(" "); int l = arr.length;
		  
		  System.out.println(l);
		  
		  System.out.println(arr[0]); System.out.println(arr[1]);
		  
		  
		  //Equals & EqualIgnoreCase
		  
		  String a = "Anjali"; String b = "anjali";
		  
		  System.out.println(a.equals(b)); System.out.println(a.equalsIgnoreCase(b));
		 
		
		
		
				

	}

}
