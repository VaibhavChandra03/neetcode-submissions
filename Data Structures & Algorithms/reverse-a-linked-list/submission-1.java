class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;

        ListNode curr = head;
        ListNode prev = null;
        ListNode next = head.next;

        while(curr != null){
            next = curr.next;   // store next node
            curr.next = prev;   // reverse link
            prev = curr;        // move prev forward
            curr = next;        // move curr forward
        }

        return prev;
    }
}