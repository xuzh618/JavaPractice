package com.tiger.algorithm.listnode;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue2Stack {

    /**
     * |          |
     * |          |
     * |          |
     * |          |
     * |          |
     * |          |
     * ___________
     */


    private Queue<Integer> queue = new LinkedList<>();

    int mTopElement;


    /**
     * 入栈
     *
     * @param x
     */
    public void push(int x) {
        //每次队尾进入元素在队列中都是后面出的，正好是栈的栈顶，要记录
        queue.offer(x);

        mTopElement = x;
    }


    /**
     * 返回栈顶元素
     *
     * @return
     */
    public int peek() {

        return mTopElement;

    }


    /**
     * 出栈
     *
     * @return
     */
    public int pop() {
        int size = queue.size();
        // 之前在队列中的元素全部出来再插入一次
        while (size > 1) {

            queue.offer(queue.poll());

            size--;
        }
        //换了一个顺序后在出队就是后进去的元素
        //注意：此时需要更新栈的顶元素也就是新的队尾元素

        mTopElement = queue.peek();
        queue.offer(queue.poll());

        return queue.poll();
    }


}
