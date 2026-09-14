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
    public ListNode partition(ListNode head, int x) {
        ListNode smallPtr = new ListNode(0);
        ListNode largePtr = new ListNode(0);

        ListNode small = smallPtr;
        ListNode large = largePtr;

        while(head!=null){
            if(head.val<x){
                small.next = head;
                small = small.next;

            }
            else{
                large.next = head;
                large = large.next; 
            }
            head = head.next;
        }

        large.next =null;
        small.next = largePtr.next;

        return smallPtr.next;


        
        
        
    }
}