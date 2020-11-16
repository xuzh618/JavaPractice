package com.tiger.algorithm.Entity;

/***
 * Define ListNode  Data Struct
 *
 */
public class ListNode {

    public int val;
    public ListNode next;

    public  ListNode(int val) {
        this.val = val;
        next = null;
    }

    public static void createListNode(int[] arry) {

        if (arry == null || arry.length < 1) {
            return;
        }

        ListNode head = new ListNode(arry[0]);
        ListNode nextNode;
        nextNode = head;

        for (int i = 1; i < arry.length; i++) {
            ListNode node = new ListNode(arry[i]);
            nextNode.next = node;
            nextNode = nextNode.next;
        }

        nextNode = head;
    }
}
