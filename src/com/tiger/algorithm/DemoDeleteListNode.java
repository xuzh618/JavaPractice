package com.tiger.algorithm;

import com.tiger.algorithm.Entity.ListNode;

public class DemoDeleteListNode {


    public ListNode delListNode(ListNode head, int val){

        // create  pre listnode
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy, p = head;

        while (p!=null){

            if(p.val == val){
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
