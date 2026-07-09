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
    public boolean isPalindrome(ListNode head) {
        ListNode middle = findMid(head);
        ListNode SecondHalf = reverse(middle);
        ListNode firstHalf = head;
        ListNode temp = SecondHalf;
        while(SecondHalf!=null){
            if(firstHalf.val != SecondHalf.val){
                reverse(temp);
                return false;
            }
            firstHalf = firstHalf.next;
            SecondHalf = SecondHalf.next;
        }
        reverse(temp);
        return true;
    }
    static ListNode reverse(ListNode head){
        ListNode cur = head;
        ListNode prev = null;
        while(cur!=null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
    static ListNode findMid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}