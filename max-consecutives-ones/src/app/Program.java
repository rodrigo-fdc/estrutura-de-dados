package app;

public class Program {

	public static int maxConsecutivesOnes(int[] numbers, int K) {
        int left = 0;
        int zerosCount = 0;
        int maxLength = 0;
        
        for (int right = 0; right < numbers.length; right++) {
            if (numbers[right] == 0) {
                zerosCount++;
            }
            
            while (zerosCount > K) {
                if (numbers[left] == 0) {
                    zerosCount--;
                }
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        

  
        int[] numbers1 = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int K1 = 2;
        System.out.println(maxConsecutivesOnes(numbers1, K1));  // Saída: 6


        int[] numbers2 = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int K2 = 3;
        System.out.println(maxConsecutivesOnes(numbers2, K2));  // Saída: 10
    }
}
