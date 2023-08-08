package app;

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
		
		for (int i = 0; i < array.length ; i++) {
			
			for (int j = i+1 ; j < array.length; j++ ) {
				
				if (array[i] + array[j] == target) {
					return new int[] {array[i], array[j]};
				}
			}
			
		}
		
		return null;
	}

}
