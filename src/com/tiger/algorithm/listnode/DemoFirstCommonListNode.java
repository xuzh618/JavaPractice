package com.tiger.algorithm.listnode;

import com.tiger.algorithm.entity.ListNode;

import java.util.Stack;

/**
 * 题目描述：输入两个链表，找出它们的第一个公共节点。
 * <p>
 * 输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
 * 输出：Reference of the node with value = 8
 * 输入解释：相交节点的值为 8 （注意，如果两个列表相交则不能为 0）。
 * 从各自的表头开始算起，链表 A 为 [4,1,8,4,5]，链表 B 为 [5,0,1,8,4,5]。
 * 在 A 中，相交节点前有 2 个节点；在 B 中，相交节点前有 3 个节点。
 */
public class DemoFirstCommonListNode {

    /**
     * 通过栈的属性可以实现链表从尾部往前扫描找到所有相同的节点，最后不一样的节点为第一个公共的节点
     * 时间复杂度和空间复杂度为O(m+n)
     *
     * @param pHead1
     * @param pHead2
     * @return
     */
    public ListNode findFirstCommonListNode1(ListNode pHead1, ListNode pHead2) {

        if (pHead1 == null || pHead2 == null) {
            return null;
        }

        Stack<ListNode> pStack1 = new Stack<ListNode>();
        Stack<ListNode> pStack2 = new Stack<ListNode>();

        while (pHead1 != null) {
            pStack1.push(pHead1);
            pHead1 = pHead1.next;
        }
        while (pHead2 != null) {
            pStack2.push(pHead1);
            pHead2 = pHead2.next;
        }

        ListNode pTemp = null;

        while (!pStack1.isEmpty() && !pStack2.isEmpty()) {
            if (pStack1.pop().val == pStack2.pop().val) {
                pTemp = pStack1.pop();
            } else {
                break;
            }
        }


        return pTemp;
    }


    /**
     * 现获取长度，然后找到长度之差，从同等长度的节点开始遍历，找到相同的元素
     *
     * @param pHead1
     * @param pHead2
     * @return
     */
    public ListNode findFirstCommonListNode2(ListNode pHead1, ListNode pHead2) {

        if (pHead1 == null || pHead2 == null) {
            return null;
        }

        int step = Math.abs(getListNodeLen(pHead1) - getListNodeLen(pHead1));
        ListNode pTemp = null;

        if (getListNodeLen(pHead1) > getListNodeLen(pHead2)) {

            while (pHead1 != null && (step > 0)) {
                pHead1 = pHead1.next;
                step--;
            }
        } else {

            while (pHead2 != null && (step > 0)) {
                pHead2 = pHead2.next;
                step--;
            }

        }
        // the same len and start to find same node
        while (pHead1 != null && pHead2 != null) {
            if (pHead1.val == pHead2.val) {
                pTemp = pHead1;
            }
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }

        return pTemp;
    }

    /**
     * 获取链表长度
     *
     * @param head
     * @return
     */
    private int getListNodeLen(ListNode head) {

        if (head == null) {
            return -1;
        }
        int i = 0;
        while (head != null) {
            i++;
            head = head.next;
        }
        return i;
    }
}