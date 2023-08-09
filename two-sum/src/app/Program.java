package app;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		int target = 9;
		int[] array = { 4, 1, 2, -2, 11, 14, 1, -1, -6, -4 };

		int[] result = findTwoSum(array, target);
		
		if (result != null) {
			System.out.println("Par encontrado: " + result[0] + ", " + result[1]);
		} else {
			System.out.println("Nenhum par encontrado que some " + target);
		}
	}
	

	private static int[] findTwoSum(int[] array, int target) {
		
		Arrays.sort(array);
		
		int left = 0;
		int right = array.length - 1;
		
		while ( left < right ) {
			int sum = array[left] + array[right];
			
			if (sum == target) {
				return new int[]{array[left], array[right]};
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
        
        return null;
	}

}
