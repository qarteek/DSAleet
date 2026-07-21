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
    static ListNode kthnode(ListNode curr, int k){
        
        while(curr!=null){
            k--;
            if(k==0) break;
            curr=curr.next;
        }
        return curr;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next ==null || k==0) return head;
        ListNode temp = head;
        int length = 1;
        while(temp.next!=null){
            length++; temp=temp.next;
        }
        

        if(k%length==0) return head;
        k=k%length;

        ListNode newtemp = kthnode(head, length - k);

        temp.next= head;
        ListNode newh = newtemp.next;
        newtemp.next=null;
        return newh;
        
    }
}