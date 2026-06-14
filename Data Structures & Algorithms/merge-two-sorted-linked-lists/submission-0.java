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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(0);
        ListNode mover = ans;
        while(list1!=null || list2!=null){
            int l1 = Integer.MAX_VALUE;
            if(list1!=null){
                l1 = Math.min(l1,list1.val);
            }
            int l2 = Integer.MAX_VALUE;
            if(list2!=null){
                l2 = Math.min(l2,list2.val);
            }

            if(l1<=l2){
                mover.next = new ListNode(l1);
                mover = mover.next;
                list1 = list1.next;
            }else{
                mover.next = new ListNode(l2);
                mover = mover.next;
                list2 = list2.next;
            }
        }
        return ans.next;
    }
}