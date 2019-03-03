package Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] [] str = new String [3] [2];
		
		//Row 1 initialization
		
		str[0] [0] = "User 1";
		str[0][1] = "Pass 1";
		
		//Row 2
		
		str[1][0] = "User 2";
		str [1] [1] = "Pass 2";
		
		//Row 3
		
		str[2] [0] = "User 3";
		str [2] [1] = "Pass 3";
		
		for(int r=0; r<3 ; r++ ) 
		{
			
			for(int c=0; c<2; c++) 
			{
				
				System.out.println(str [r][c]);
				
			}		
		}

	}

}
