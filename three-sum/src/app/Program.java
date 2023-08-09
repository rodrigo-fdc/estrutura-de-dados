package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static List<List<Integer>> threeSum(int[] array, int target){
		List<List<Integer>> result = new ArrayList<>();
		
		Arrays.sort(array);
		
		for (int i = 0; i < array.length -2; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				for (int k = j + 1; k < array.length; k++) {
					if (array[i] + array [j] +  array[k] == target) {
						List<Integer> numeros = new ArrayList<>();
						numeros.add(array[i]);
						numeros.add(array[j]);
						numeros.add(array[k]);
						result.add(numeros);
					}
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
		int target = 0;
		
		List<List<Integer>> result = threeSum(array, target);
		
		for (List<Integer> numbers : result) {
			System.out.println(numbers);
		}

	}

}
