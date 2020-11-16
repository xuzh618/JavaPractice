package com.tiger.algorithm;

import java.util.HashMap;

/***
 * 题目：找出数组中的重复数字
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 *
 * Example:
 * 如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 *
 * 问题解析：
 * 元素在0到n-1的范围；
 * 给出任意一个重复数字。
 *
 */
public class DemoFindSameNums {


    /**
     * Function: hashmap
     *
     * @param arry
     * @return
     */
    public int findSameNum(int[] arry) {

        if (arry == null) {
            return -1;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0, len = arry.length; i < len; i++) {

            if (map.containsKey(arry[i])) {
                return arry[i];
            }

            map.put(arry[i], i);
        }

        return -1;
    }


    public int findSameNum2(int[] arry) {

        if (arry == null) {
            return -1;
        }

        /**
         * {2,3,1,0,2,5,3}
         *
         * i=0;
         * 1,3,2,0,2,5,3
         * 3,1,2,0,2,5,3
         * 0,1,2,3,2,5,3
         *
         * i=1;
         *
         * i=2;
         *
         * i=3;
         *
         * i=4;
         * a[4] = 2; a[2] = 2
         *
         */
        for (int i = 0, len = arry.length; i < len; i++) {
            while (i != arry[i]) {

                if (arry[i] == arry[arry[i]]) {
                    return arry[i];
                }

                int temp = arry[i];
                arry[i] = arry[arry[i]];
                arry[arry[i]] = temp;
            }
        }

        return -1;
    }


}
