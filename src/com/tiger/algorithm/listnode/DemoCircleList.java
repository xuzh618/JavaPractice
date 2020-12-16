package com.tiger.algorithm.listnode;

import com.tiger.algorithm.entity.ListNode;

/**
 * 题目：环形链表
 *
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 *
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 *
 * 说明：不允许修改给定的链表。
 *
 *
 *
 * 示例 1：
 *
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：tail connects to node index 1
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 *
 */
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
