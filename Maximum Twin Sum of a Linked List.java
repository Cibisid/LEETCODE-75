class Solution {
    public int pairSum(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode curr = head;
        int i = 0;

        while (curr != null) {
            map.put(i, curr.val);
            curr = curr.next;
            ++i;
        }

        int maxSum = 0;
        int start = 0, end = i - 1;
        while (start < end) {
            maxSum = Math.max(maxSum, map.get(start) + map.get(end));
            ++start;
            --end;
        }

        return maxSum;
    }
}