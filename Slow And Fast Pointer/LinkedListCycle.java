/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.
*/

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    public static void main(String[] args) {
        
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        
        ListNode slow = head;  // Tortoise - moves 1 step
        ListNode fast = head;  // Hare - moves 2 steps
        
        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move 1 step
            fast = fast.next.next;     // Move 2 steps
            
            if (slow == fast) {        // They met! Cycle exists
                return true;
            }
        }
        
        return false;  // Fast reached end, no cycle
    }
}
