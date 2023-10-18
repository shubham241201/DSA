public class Solution {
  
  public ListNode sortList(ListNode head) {
    if (head == null || head.next == null)
      return head;
        
    // step 1. cut the list to two halves
    ListNode prev = null, slow = head, fast = head;
    
    while (fast != null && fast.next != null) {
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    
    prev.next = null;
    
    // step 2. sort each half
    ListNode l1 = sortList(head);
    ListNode l2 = sortList(slow);
    
    // step 3. merge l1 and l2
    return merge(l1, l2);
  }
  
  ListNode merge(ListNode l1, ListNode l2) {
      ListNode head = new ListNode();
      ListNode temp = head;

      while(l1!= null && l2!= null){
          if(l1.val > l2.val){
              temp.next = l2;
              l2 = l2.next;
              temp = temp.next;
          }else{
              temp.next = l1;
              l1 = l1.next;
              temp = temp.next;
          }
      }
      while(l1 != null){
            temp.next = l1;
            l1 = l1.next;
            temp = temp.next;
      }
      while(l2 != null){
          temp.next = l2;
          l2 = l2.next;
          temp = temp.next;
      }
      return head.next;
  }
}