package com.tiger.algorithm.arrays;

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

    /**
     * 解题思路
     * 从题目我们可以知道，数组长度为 n，所有数字都在 0~n-1 范围内。如果元素不重复，那么数组应该就是 [0, 1, 2, ...n-1]
     * （假设给数组排完了序）。也就是说，递增排序后，数组中的元素值与其对应的下标应该是相同的，即下标为 0 的元素值也是 0，以此类推。
     *
     * 首先，我们可以遍历数组，若存在元素不在 0~n-1 的范围内，直接返回 -1。
     *
     * 接着，再次遍历数组，若下标 i 与对应元素 nums[i] 不同，即 nums[i] != i，我们应该把 nums[i] 这个元素交换到正确的位置nums[i]上。
     * 交换前，先判断 nums[i] 与 nums[nums[i]] 这两个元素是否相同，相同说明存在重复元素，直接返回，否则进行 swap 交换。交换过后，
     * 我们需要再次判断 i 位置上的元素.
     *
     *
     */


}
