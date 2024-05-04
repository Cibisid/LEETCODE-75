class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        Deque<Character> q = new LinkedList<>();
        for (char c : s.toCharArray()) {
            while (q.contains(c)) {
                q.pollFirst();
            }
            q.offerLast(c);
            res = Math.max(res, q.size());
        }
        return res;
    }
}