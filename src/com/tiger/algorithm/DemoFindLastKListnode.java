package com.tiger.algorithm;

import com.tiger.algorithm.Entity.ListNode;

/**
 * 题目描述
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
 * <p>
 * 注意：本题相对原题稍作改动
 * <p>
 * 示例：
 * <p>
 * 输入： 1->2->3->4->5 和 k = 2
 * 输出： 4
 * 说明：
 * <p>
 * 给定的 k 保证是有效的。
 * <p>
 * 解法
 * 定义 p、q 指针指向 head。
 * <p>
 * p 先向前走 k 步，接着 p、q 同时向前走，当 p 指向 null 时，q 指向的节点即为链表的倒数第 k 个节点。
 */
public class DemoFindLastKListnode {

    public int kth2Last(ListNode head, int k) {

        ListNode p = head, q = head;
        int i = 0;

        while (i < k) {
            p = p.next;
            i++;
        }

        while (p != null) {
            p = p.next;
            q = q.next;
        }

        return q.val;
    }

}
