package com.tiger.algorithm;

import com.tiger.algorithm.Entity.ListNode;

/**
 *题目描述
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 * 示例 1：
 *
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 * 限制：
 *
 * 0 <= 链表长度 <= 10000
 */
public class DemoDeleteListNode {

    public ListNode delListNode(ListNode head, int val) {

        // create  pre listnode
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy, p = head;

        while (p != null) {

            if (p.val == val) {
                pre.next = p.next;
                //dummy = pre;
                break;
            }

            pre = p;
            p = p.next;
        }

        return dummy.next;
    }


}
