/*
Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.
*/

public class LinkedListCycleII {
    public static void main(String[] args) {
        
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode meetingPt = null;
         if (head == null || head.next == null) {
            return meetingPt;
        }
        
        ListNode slow = head;  // Tortoise - moves 1 step
        ListNode fast = head;  // Hare - moves 2 steps
        
        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move 1 step
            fast = fast.next.next;     // Move 2 steps
            
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                slow = fast;
                meetingPt = slow;

                return meetingPt;
            }
        }
        
        return meetingPt;  // Fast reached end, no cycle
    }
}
