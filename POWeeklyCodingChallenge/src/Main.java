import java.util.Arrays;

public class Main {
	
	

	public static void main(String[] args) {
		int[] arr = {515, 341, 98, 44, 211};
		System.out.println(Arrays.toString(digitSort(arr, "desc")));
		
		int[] arr1 = {2, 8, 4, 1};
		int[] arr2 = {-1, -10, 1, -2, 20};
		int[] arr3 = {-1, -20, 5, -1, -2, 2};
		System.out.println(canPartition(arr1));
		System.out.println(canPartition(arr2));
		System.out.println(canPartition(arr3));

	}
	
	//Code for part a
	public static int[] digitSort(int[] arr, String order) {
		int[] reorderedArr = new int[arr.length];
		
		for(int i = 0; i < arr.length; ++i) {
			char[] numChars = Integer.toString(arr[i]).toCharArray();
			Arrays.sort(numChars);
			
			if(order.equals("desc")) {
				char[] revChars = new char[numChars.length];
				for (int j = 0; j < numChars.length; ++j) {
					revChars[j] = numChars[numChars.length - j - 1];
				}
				reorderedArr[i] = Integer.parseInt(new String(revChars));
			}
			else {
				reorderedArr[i] = Integer.parseInt(new String(numChars));
			}
			
		}
		
		return reorderedArr;
	}
	
	//Code for part b
	public static boolean canPartition(int[] arr) {
		int product = 1;
		for(int i = 0; i < arr.length; ++i) {
			for(int j = 0; j < arr.length; ++j) {
				if(j != i) {
					product *= arr[j];
				}
			}
			
			if(arr[i] == product) {
				return true;
			}
			product = 1;
		}
		
		
		return false;
	}

}
