/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.List;
public class Solution {
    public boolean hasCycle(ListNode head) {
        // List<ListNode> list = new ArrayList<>();
        // the contains() method works faster in HashSet compared to an ArrayList.
        HashSet<ListNode> set = new HashSet<>();

        ListNode temp = head;
        while(temp!=null){
            if(set.contains(temp)){
                return true;
            }
            // Note that you are adding address of the node and not the value of the node. 
            set.add(temp);
            temp = temp.next;
        }
        return false;
    }
}