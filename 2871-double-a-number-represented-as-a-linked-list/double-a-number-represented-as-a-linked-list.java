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
    public static int doble(ListNode head){
        if(head == null){
            return 0;
        }
        int carry= doble(head.next);
        int sum = head.val * 2 + carry;
        head.val = sum%10;

        return sum/10; 
    }

    public ListNode doubleIt(ListNode head) {

        int carr =  doble(head);

        if(carr>0){
            ListNode newl = new ListNode(carr, head);
            return newl;
        }

        return head;

        
    }
}