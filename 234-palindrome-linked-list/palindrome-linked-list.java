/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
      public ListNode reverseList(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode newhead = reverseList(head.next);
            ListNode front = head.next;
            front.next =head;
            head.next = null;
            return newhead;
        
    }
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode temp2 = head;
        while(temp.next!=null&& temp.next.next!=null){
            temp2= temp2.next;
            temp=temp.next.next;
        }
        ListNode newhead = reverseList(temp2.next);
        ListNode slow = newhead, fast = head;
        while(slow!=null){
            if(fast.val!=slow.val){ reverseList(newhead); return false;}

            slow= slow.next;
            fast = fast.next;


        }
        reverseList(newhead);
        return true;
        
    }
}