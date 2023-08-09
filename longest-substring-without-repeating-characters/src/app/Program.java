package app;

import java.util.HashMap;

public class Program {

	public static int longestSubstringWithoutRepeating (String s) {
		
		int maxLength = 0;
		int start = 0;
		int end = 0;
		
		HashMap<Character, Integer> charMap = new HashMap<>();
		
		while (end < s.length()) {
			if (charMap.containsKey(s.charAt(end)) && charMap.get(s.charAt(end)) >= start) {
				start = charMap.get(s.charAt(end)) + 1;
			}
			
			charMap.put(s.charAt(end), end);
			
			maxLength = Math.max(maxLength, end - start +1);
			
			end++;
			
		}
		
		
		
		return maxLength;
	}
	
	public static void main(String[] args) {
		String entrada1 = "abcabcbb";
        int saida1 = longestSubstringWithoutRepeating(entrada1);
        System.out.println("Exemplo 1 - Saída: " + saida1);  // Saída esperada: 3

        String entrada2 = "zzzabcdzzz";
        int saida2 = longestSubstringWithoutRepeating(entrada2);
        System.out.println("Exemplo 2 - Saída: " + saida2);  // Saída esperada: 5

	}

}
