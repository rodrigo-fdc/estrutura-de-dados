package app;

import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		int target = 9;
		int[] array = { 4, 1, 2, -2, 11, 15, 1, -1, -6, -4 };

		int[] result = findTwoSum(array, target);
		
		if (result != null) {
			System.out.println("Par encontrado: " + result[0] + ", " + result[1]);
		} else {
			System.out.println("Nenhum par encontrado que some " + target);
		}
	}
	

	private static int[] findTwoSum(int[] array, int target) {
		
		Map<Integer, Integer> numIndexMap = new HashMap<>();
        
        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];
            
            if (numIndexMap.containsKey(complement)) {
                return new int[]{complement, array[i]};
            }
            
            numIndexMap.put(array[i], i);
        }
        
        return null;
	}

}
