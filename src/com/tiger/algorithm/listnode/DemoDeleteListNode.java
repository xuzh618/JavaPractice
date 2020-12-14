package com.tiger.algorithm.listnode;

import com.tiger.algorithm.entity.ListNode;


public class DemoDeleteListNode {

    /**
     * 题目描述
     * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
     * <p>
     * 返回删除后的链表的头节点。
     * <p>
     * 注意：此题对比原题有改动
     * <p>
     * 示例 1:
     * <p>
     * 输入: head = [4,5,1,9], val = 5
     * 输出: [4,1,9]
     * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
     * 示例 2:
     * <p>
     * 输入: head = [4,5,1,9], val = 1
     * 输出: [4,5,9]
     * 解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
     * 说明：
     * <p>
     * 题目保证链表中节点的值互不相同
     * 若使用 C 或 C++ 语言，你不需要 free 或 delete 被删除的节点
     *
     * @param head
     * @param val
     * @return
     */
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
