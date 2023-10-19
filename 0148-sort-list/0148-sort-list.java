public class Solution {
  
  public ListNode sortList(ListNode head) {
      if(head == null || head.next == null){
          return head;
      }

      ListNode f = head;
      ListNode s = head;
      ListNode prev = null;
      
      while(f != null && f.next !=null){
          prev = s;
          s = s.next;
          f = f.next.next; 
      }

      prev.next = null;

      ListNode l1 = sortList(head);
      ListNode l2 = sortList(s);

      return merge(l1, l2);
  }  


  ListNode merge(ListNode l1, ListNode l2){
      ListNode head = new ListNode();
      ListNode temp = head;

      while(l1 != null && l2 != null){
          if(l1.val > l2.val){
              temp.next = l2;
              l2 = l2.next;
            //   temp = temp.next;
          }else{
              temp.next = l1;
              l1 = l1.next;
            //   temp = temp.next;
          }
          temp = temp.next;
      }

      if(l1 != null){
              temp.next = l1;
              temp = temp.next;
       }

        if(l2 != null){
            temp.next = l2;
            temp = temp.next;
        }
          
        return head.next;   
  }
}