package com.tiger.algorithm.listnode;

import java.util.Stack;

public class DemoStack2Queue {

    private Stack<Integer> stackInput = new Stack<>();

    private Stack<Integer> stackOutPut = new Stack<>();


    /***
     *  参考：https://zhuanlan.zhihu.com/p/107761819
     * 重点在找到队首的元素，这样能保证output拿到最新入队的元素
     *
     * push-peek-pop（包含peek操作）
     *
     *  stackoutput       stackinput
     * --------------   -------------
     * <-            |  |  1 2 3    <-
     * --------------   -------------
     * font                        rear
     */

    /**
     * is empty
     *
     * @return
     */
    public boolean isEmpty() {

        return (stackInput.isEmpty() && stackOutPut.isEmpty());

    }

    /**
     * 将一个元素放入队列的尾部,入队
     *
     * @param x
     */
    public void push(int x) {

        stackInput.push(x);

    }

    /**
     * 返回队列首部的元素。
     *
     * @return
     */
    public int peek() {

        //如果为空，全部移过来，不为空，先过去的一定是队头
        if (stackOutPut.isEmpty()) {
            while (!stackInput.isEmpty()) {
                stackOutPut.push(stackInput.pop());
            }
        }

        return stackOutPut.peek();

    }


    /**
     * 从队列首部移除元素
     */
    public int pop() {

        peek();//先保证队头的数据是最久进来的

        return stackOutPut.pop();

    }


}
