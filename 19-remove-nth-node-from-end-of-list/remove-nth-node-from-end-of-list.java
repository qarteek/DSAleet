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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode slow = head, temp =  head;
        for(int i = 0; i<n ;i++){
            temp=temp.next;
        }
        if(temp==null) return head=head.next;
        while(temp.next!=null){
            slow=slow.next;
            temp=temp.next;
        }

        ListNode newl = slow.next;
        slow.next= slow.next.next;

        return head;


    }
}