public class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> vow = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        
        // Collect all vowels in the string
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                vow.add(s.charAt(i));
            }
        }
        
        int length = vow.size() - 1;

        // Build the result string with reversed vowels
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                str.append(vow.get(length--)); // Append vowels from the end of the list
            } else {
                str.append(s.charAt(i)); // Append non-vowel characters unchanged
            }
        }

        return str.toString();
    }

    // Helper function to check if a character is a vowel
    private boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case
        String input = "hello world";
        String output = solution.reverseVowels(input);
        
        System.out.println("Original string: " + input);
        System.out.println("String with reversed vowels: " + output);
    }
}
