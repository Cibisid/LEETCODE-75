class Solution {
    public boolean isPalindrome(String s) {
  
        StringBuilder newstring = new StringBuilder();
        boolean IsPalindrome = true;

        for (int i = 0; i < s.length(); i++) {

            if (Character.isLetterOrDigit(s.charAt(i))) {
                newstring.append(Character.toLowerCase(s.charAt(i)));

            }
        }

        int size = newstring.length();

        for (int i = 0; i < size / 2; i++) {

            if (newstring.charAt(i) != newstring.charAt(size - 1 - i)) {//moom
                IsPalindrome = false;
                break;
            }

        }
        return IsPalindrome;
        }

}