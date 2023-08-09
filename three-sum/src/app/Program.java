package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static List<List<Integer>> threeSum(int[] array, int target){
		List<List<Integer>> result = new ArrayList<>();
		
        Arrays.sort(array);
        
        for (int i = 0; i < array.length - 2; i++) {
            if (i > 0 && array[i] == array[i - 1]) {
                continue; // Ignora elementos duplicados para evitar duplicação de resultados
            }
            
            int left = i + 1;
            int right = array.length - 1;
            
            while (left < right) {
                int sum = array[i] + array[left] + array[right];
                
                if (sum == target) {
                    result.add(Arrays.asList(array[i], array[left], array[right]));
                    
                    // Avança o ponteiro esquerdo para evitar duplicação de resultados
                    while (left < right && array[left] == array[left + 1]) {
                        left++;
                    }
                    
                    // Recua o ponteiro direito para evitar duplicação de resultados
                    while (left < right && array[right] == array[right - 1]) {
                        right--;
                    }
                    
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
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
