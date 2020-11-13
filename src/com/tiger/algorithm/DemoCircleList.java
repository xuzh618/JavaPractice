package com.tiger.algorithm;

import com.tiger.algorithm.Entity.ListNode;

public class DemoCircleList {


    /***
     * function: ListNode is cycle
     * @param head
     * @return
     */
    public boolean isCycleListNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }


    /**
     * function: find the entry node in the cycle listnode
     *
     * @param head
     * @return
     */
    public ListNode findCycleListNodeEntry(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        boolean isCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isCycle = true;
                break;
            }
        }
        ListNode entryNode = null;

        if (isCycle) {
            entryNode = head;
            while (entryNode != slow) {
                entryNode = entryNode.next;
                slow = slow.next;
            }
        }

        return entryNode;
    }
}
