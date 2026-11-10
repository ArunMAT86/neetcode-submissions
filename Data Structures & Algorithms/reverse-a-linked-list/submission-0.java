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

    ListNode current = head;

    ListNode previous = null;


        while(current != null){

        ListNode temp = current.next; // temp = 1 

            current.next = previous; // 

            previous = current; // now current = 1

            current = temp;


        }

        return previous;


    }
}
