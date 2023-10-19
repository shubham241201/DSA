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

        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode f = head;
        ListNode s = f.next;

        while(f != null){
            f.next = prev;
            prev = f;
            f = s;
            if(s != null){
                s = s.next;
            }
        }
        head = prev;
        return head;
    }    
}