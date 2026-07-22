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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;

        }
        Deque<ListNode> stack = new ArrayDeque<>();
        // ListNode temp = head;

        while(slow!=null){
            stack.push(slow);
            slow= slow.next;
        }

        ListNode temp = head;
        int j = 0;
        int size = stack.size();
        while(j<size){
            ListNode el = stack.pop();
            el.next=temp.next;
            temp.next=el;
            temp=temp.next.next;
            j++;
        }
        temp.next=null;


        




        
    }
}