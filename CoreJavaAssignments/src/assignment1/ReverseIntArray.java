package assignment1;

public class ReverseIntArray {

	public static void main(String[] args) {

		int[] arr = new int[10];
		
		System.out.println("Original Array :");
		for(int i=0; i<10; i++) {
			arr[i]+=i;
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nArray in reverse order :");
		for(int i=9; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		
	
	}

}
