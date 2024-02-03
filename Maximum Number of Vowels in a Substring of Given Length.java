class Solution {
    public int maxVowels(String s, int k) {
        int currCount = 0, len = s.length();
        
        for (int i = 0; i < k; i++) {
            currCount += isVowel(s.charAt(i)) ? 1 : 0;
        }
        
        int maxCount = currCount;

        for (int i = 1; i <= len-k; i++) {
            if (isVowel(s.charAt(i-1))) currCount--;    
            if (isVowel(s.charAt(i+k-1))) currCount++;
            maxCount = Integer.max(maxCount, currCount);
        }
        return maxCount;
    }
    
    private boolean isVowel(char c) {
        return c == 97 || c == 101 || c == 105 || c == 111 || c == 117;
    }
}