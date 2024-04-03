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
/*
This explicitly states that this function returns a ListNode. The definition of a ListNode shows that val is set to whatever is passed or 0.

Definition for singly-linked list.
  function ListNode(val, next) {
     this.val = (val===undefined ? 0 : val)
     this.next = (next===undefined ? null : next)
 }

*/
class Solution {
    public void add(int data,ListNode head){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
      }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        Solution obj = new Solution();
        ListNode list3 = new ListNode();
        
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode head3 = list3;
        if(head1 == null && head2 != null){
          return head2;
        }
        else if(head1 != null && head2 == null){
          return head1;
        }
        else if(head1 == null && head2 == null){
          return null;
        }else{
           while(head1!=null && head2!=null){
             if(head1.val<=head2.val){
                    obj.add(head1.val,head3);
                    head1 = head1.next;
             }else{
                    obj.add(head2.val,head3);
                    head2 = head2.next;
             }     
        }
       if(head1 == null){
        while(head2!=null){
            obj.add(head2.val,head3);
            head2 = head2.next;
        }
       }else{
         while(head1!=null){
            obj.add(head1.val,head3);
            head1 = head1.next;
        }
       }
       head3 = head3.next;
       return head3;
}
}
       
}
  