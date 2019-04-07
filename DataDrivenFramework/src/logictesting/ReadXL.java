package logictesting;

import java.io.IOException;

import configuration.config;
import liberaries.Xls_Reader;

public class ReadXL {

	public static void main(String[] args) throws IOException {

		Xls_Reader xl = new Xls_Reader(config.testData);
		
		int rows = xl.getrowcount("Sheet1");
		int cols = xl.getColumncount("Sheet1");
		
		String[][] data = new String[rows-1][cols];
		
		for( int r=2; r<=rows; r++)
		{
			for (int c= 1; c<=cols; c++)
			{
//				System.out.println(xl.getCellData("Sheet1", r, c));
				
				data[r-2][c-1]= xl.getCellData("Sheet1", r, c);
			}
		}
		
		for(int r=0; r<data.length;r++)
		{
			for (int c= 0; c<data[r].length; c++)
			{
				
				System.out.println(data[r][c]);
				
			}
		}
		
		
	}

}

