class Solution {
    public ListNode reverseList(ListNode head) 
    {
        if(head== null || head.next==null) 
            return head; e
        }
        ListNode reverse = reverseList(head.next); 
        head.next.next=head;
        return reverse; 
    }
}