package com.tiger.algorithm.listnode;

import com.tiger.algorithm.entity.ListNode;

import java.util.Stack;


public class DemoReverseListNode {


    /**
     * 题目描述
     * 反转一个单链表。
     * <p>
     * 示例:
     * <p>
     * 输入: 1->2->3->4->5->NULL
     * 输出: 5->4->3->2->1->NULL
     * 进阶:
     * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
     * <p>
     * 解法
     * 定义指针 p、q 分别指向头节点和下一个节点，pre 指向头节点的前一个节点。
     * <p>
     * 遍历链表，改变指针 p 指向的节点的指向，将其指向 pre 指针指向的节点，即 p.next = pre。然后 pre 指针指向 p，p、q 指针往前走。
     * <p>
     * 当遍历结束后，返回 pre 指针即可。
     *
     * @param head
     * @return
     */
    public ListNode reverlistNode(ListNode head) {

        ListNode pre = null;
        ListNode p = head;

        while (p != null) {
            ListNode q = p.next;
            p.next = pre;
            pre = p;
            p = q;
        }

        return pre;

    }

    /**
     * 题目描述
     * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
     * <p>
     * 示例 1：
     * <p>
     * 输入：head = [1,3,2]
     * 输出：[2,3,1]
     * 限制：
     * <p>
     * 0 <= 链表长度 <= 10000
     *
     * @param head
     * @return
     */
    public int[] reverseListNode(ListNode head) {

        Stack<Integer> s = new Stack<>();

        while (head != null) {
            s.push(head.val);
            head = head.next;
        }

        int[] res = new int[s.size()];
        int i = 0;

        while (!s.isEmpty()) {
            res[i++] = s.pop();
        }
        return res;
    }
}
