package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberTriangleUser {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader a = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(a);
		
		System.out.println("Enter a number : ");
		
		int num = Integer.parseInt(br.readLine());
		
		for (int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
