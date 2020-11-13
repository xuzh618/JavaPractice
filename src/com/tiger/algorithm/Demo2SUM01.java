package com.tiger.algorithm;

import java.util.Arrays;


/**
 * 题目：两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 */
public class Demo2SUM01 {

    public static void main(String[] args) {

        int[] arry = new int[]{2, 7, 9, 20, 30, 4, 6};
        int target = 8;
        //
        int[] indexs = find2Sum01(arry, target);
        if (indexs != null) {
            System.out.println("Find2Sum01: " + indexs[0] + "," + indexs[1]);
        }
    }


    /**
     * DESC:
     * 1. sort first
     * 2. two pointer traverse
     *
     * @param arry
     * @param target
     * @return
     */
    private static int[] find2Sum01(int[] arry, int target) {

        if (arry == null) {
            return new int[]{-1, -1};
        }
        printArryElement(arry);
        // sort first
        Arrays.sort(arry);
        printArryElement(arry);

        int i = 0, j = arry.length - 1;
        while (i < j) {

            if (arry[i] + arry[j] == target) {
                return new int[]{i, j};
            }

            if (arry[i] + arry[j] < target) {
                i++;
            } else {
                j--;
            }

        }
        return new int[]{-1, -1};
    }

    private static void printArryElement(int[] arry) {
        if ((null == arry) && (arry.length == 0)) {
            System.out.println("arry is null or empty!");
        }

        System.out.print("array is: ");

        for (int i = 0; i < arry.length; i++) {
            if (i == arry.length - 1) {
                System.out.println(arry[i]);
            } else {
                System.out.print(arry[i] + ",");
            }
        }

    }
}
