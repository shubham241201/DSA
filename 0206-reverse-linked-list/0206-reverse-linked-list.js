/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function(head) {
    if(head == null || head.next == null){
        return head;
    }

    let prev = null;
    let f = head;
    let s = f.next;


    while(f!= null){
        f.next = prev;
        prev = f;
        f = s;
        if(s!== null){
            s = s.next;
        }
    }
    head = prev;
    return head;
};